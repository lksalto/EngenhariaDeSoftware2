package org.example.Aula5.PCS.ex1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    @Test //caminho 1-2-3-4-5-3-4-5-3-4-5-3-4-5-3-4-5-3-4-5-6-8
    void testValorNegativo() throws Exception {
        Calculadora calc = new Calculadora();

        assertEquals(calc.somatoriaLimitada(-5, 900), 15);
    }

    @Test // caminho 1-3-4-5-3-4-5-3-4-5-3-4-5-3-4-5-3-4-5-6-7
    void testValorMaiorQueMaximo() throws Exception{
        Calculadora calc = new Calculadora();
        Exception exception = assertThrows(Exception.class, () -> calc.somatoriaLimitada(5, 9));
        assertEquals("valor maximo foi ultrapassado", exception.getMessage());

    }
}