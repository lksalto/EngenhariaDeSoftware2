package org;

import org.PC4.ex1.MathOps;
import org.PC4.ex1.Primo;
import org.PC4.ex1.Somatoria;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

import static org.junit.jupiter.api.Assertions.*;
class SomatoriaTest {
    MathOps mockMathOps = mock(MathOps.class);
    Primo mockPrimo = mock(Primo.class);

    @Test
    void somaDeFatoriais1() {
        when(mockPrimo.ehPrimo(5)).thenReturn(true);
        when(mockPrimo.ehPrimo(10)).thenReturn(false);

        when(mockMathOps.fatorial(10)).thenReturn(10 * 9 * 8 * 7 * 6 * 5 * 4 * 3 * 2);

        Somatoria somatoria = new Somatoria(mockMathOps);
        int[] vetor = {5, 10};
        assertEquals(10 * 9 * 8 * 7 * 6 * 5 * 4 * 3 * 2, somatoria.somaDeFatoriais(vetor, mockPrimo));

    }

    @Test
    void somaDeFatoriais2() {
        when(mockPrimo.ehPrimo(3)).thenReturn(true);
        when(mockPrimo.ehPrimo(4)).thenReturn(false);
        when(mockPrimo.ehPrimo(4)).thenReturn(false);
        when(mockPrimo.ehPrimo(5)).thenReturn(true);

        when(mockMathOps.fatorial(3)).thenReturn(3 * 2);
        when(mockMathOps.fatorial(4)).thenReturn(4 * 3 * 2);
        when(mockMathOps.fatorial(5)).thenReturn(5 * 4 * 3 * 2);

        Somatoria somatoria = new Somatoria(mockMathOps);
        int[] vetor = {3, 4, 4, 5};
        assertEquals(2 * (4 * 3 * 2), somatoria.somaDeFatoriais(vetor, mockPrimo));

    }
}