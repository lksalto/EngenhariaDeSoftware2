package org.example.Aula5.cx_branca.ex6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    /*
    -------------------------------------------------------------------------
    NO FIM ACABOU QUE NÃO TESTOU TODAS AS BRANCHES (FALTOU 9/12)
    -------------------------------------------------------------------------
    */


    //caminho 1, 3;
    @Test
    void testInicioDoIntervaloNegativo() {
        var c = new Calculadora();
        int[] vetor = {10, 20, 3, 44, 101, 1, 2, 3, 4, 5, 11, 30, 124, 1};
        var res = c.calcularMedia(vetor, -10, 10);
        assertEquals(-1, res);
    }

    //caminho 1, 2, 4, 6, 7, 9, 10, 11, 8, 7, 9, 10, 11, 8, 7, 12;
    @Test
    void testVetor2NumerosValidos()
    {
        var c = new Calculadora();
        int[] vetor = {4, 5};
        var res = c.calcularMedia(vetor, 0, 10);
        assertEquals(4.5, res, 0.000001);
    }

    //caminho 1, 2, 4, 5;
    @Test
    void testInicioDoIntervaloMaiorQueFim()
    {
        var c = new Calculadora();
        int[] vetor = {4, 5, 7 ,9};
        var res = c.calcularMedia(vetor, 4, 1);
        assertEquals(-1, res);
    }


}