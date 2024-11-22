package org.example.Aula5.cx_branca.ex6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    //caminho 1, 3
    @Test
    void testInicioDoIntervaloNegativo() {
        var c = new Calculadora();
        int[] vetor = {10, 20, 3, 44, 101, 1, 2, 3, 4, 5, 11, 30, 124, 1};
        var res = c.calcularMedia(vetor, -10, 10);
        assertEquals(-1, res);
    }



}