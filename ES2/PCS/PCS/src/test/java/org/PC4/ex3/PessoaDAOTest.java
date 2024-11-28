package org.PC4.ex3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class PessoaDAOTest {
    RHService mockRHService = mock(RHService.class);
    PessoaDAO pessoaDao = new PessoaDAO(mockRHService);
    ArrayList<Pessoa> pessoas = new ArrayList<>();

    @BeforeEach
    void Setup()
    {
        Pessoa p1= new Pessoa();
        p1.codigo = 1;
        p1.idade = 12;
        p1.nome = "André";
        Pessoa p2= new Pessoa();
        p2.codigo = 2;
        p2.idade = 15;
        p2.nome = "Bianca";
        Pessoa p3= new Pessoa();
        p3.codigo = 3;
        p3.idade = 19;
        p3.nome = "Carla";
        Pessoa p4= new Pessoa();
        p4.codigo = 4;
        p4.idade = 22;
        p4.nome = "Dunha";
        Pessoa p5= new Pessoa();
        p5.codigo = 5;
        p5.idade = 38;
        p5.nome = "Elisângela";
        Pessoa p6= new Pessoa();
        p6.codigo = 6;
        p6.idade = 41;
        p6.nome = "Fabrício";

        pessoas.add(p1);
        pessoas.add(p2);
        pessoas.add(p3);
        pessoas.add(p4);
        pessoas.add(p5);
        pessoas.add(p6);

    }

    @Test
    void existePessoa() {
        when(mockRHService.getAllPessoas()).thenReturn(pessoas);
        assertEquals(pessoaDao.existePessoa("Elisângela"), true);

    }

    @Test
    void naoExistePessoa() {
        when(mockRHService.getAllPessoas()).thenReturn(pessoas);
        assertEquals(pessoaDao.existePessoa("Xavier"), false);
    }
}