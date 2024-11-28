package org.PC4.ex2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class TurmaControllerTest {
    TurmaDAO mockTurmaDao = mock(TurmaDAO.class);
    VerificadorDeCodigos mockVerificadorDeCodigos = mock(VerificadorDeCodigos.class);
    Turma t = new Turma();

    @Test
    void verificaCodigoDisciplinaInvalido() {
        t.codDisciplina = "-";
        when(mockVerificadorDeCodigos.verificarCodigoDisciplina("-")).thenReturn(false);
        when(mockTurmaDao.salvar(t)).thenReturn(false);

        TurmaController turmaController = new TurmaController(mockTurmaDao);
        turmaController.setVerificador(mockVerificadorDeCodigos);
        assertEquals("codigo disciplina invalido", turmaController.cadastrarTurma(t));
    }
    @Test
    void verificaCodigoTurmaInvalido() {
        t.codDisciplina = "1";
        t.codTurma = "-";
        when(mockVerificadorDeCodigos.verificarCodigoDisciplina("1")).thenReturn(true);
        when(mockVerificadorDeCodigos.verificarCodigoTurma("-")).thenReturn(false);
        when(mockTurmaDao.salvar(t)).thenReturn(false);

        TurmaController turmaController = new TurmaController(mockTurmaDao);
        turmaController.setVerificador(mockVerificadorDeCodigos);
        assertEquals("codigo turma invalido", turmaController.cadastrarTurma(t));
    }
    @Test
    void verificaTurmaJaExiste() {
        t.codDisciplina = "1";
        t.codTurma = "3";

        when(mockVerificadorDeCodigos.verificarCodigoDisciplina("1")).thenReturn(true);
        when(mockVerificadorDeCodigos.verificarCodigoTurma("3")).thenReturn(true);
        when(mockTurmaDao.existe(t)).thenReturn(true);



        TurmaController turmaController = new TurmaController(mockTurmaDao);
        turmaController.setVerificador(mockVerificadorDeCodigos);
        assertEquals("turma ja existe", turmaController.cadastrarTurma(t));
    }
    @Test
    void verificaSalvoComSucesso() {
        t.codDisciplina = "1";
        t.codTurma = "3";

        when(mockVerificadorDeCodigos.verificarCodigoDisciplina("1")).thenReturn(true);
        when(mockVerificadorDeCodigos.verificarCodigoTurma("3")).thenReturn(true);
        when(mockTurmaDao.existe(t)).thenReturn(false);
        when(mockTurmaDao.salvar(t)).thenReturn(true);


        TurmaController turmaController = new TurmaController(mockTurmaDao);
        turmaController.setVerificador(mockVerificadorDeCodigos);
        assertEquals("turma salva com sucesso", turmaController.cadastrarTurma(t));
    }
    @Test
    void verificaErroBD() {
        t.codDisciplina = "1";
        t.codTurma = "3";

        when(mockVerificadorDeCodigos.verificarCodigoDisciplina("1")).thenReturn(true);
        when(mockVerificadorDeCodigos.verificarCodigoTurma("3")).thenReturn(true);
        when(mockTurmaDao.existe(t)).thenReturn(false);
        when(mockTurmaDao.salvar(t)).thenReturn(false);


        TurmaController turmaController = new TurmaController(mockTurmaDao);
        turmaController.setVerificador(mockVerificadorDeCodigos);
        assertEquals("turma nao salva. Erro no BD", turmaController.cadastrarTurma(t));
    }

}