package org.example.Aula5.PCS.ex4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OriginalTest {

    @Test
    void testMutante1() {
        Original o = new Original();
        int[] v = {1, 9, 10 ,2, 3, 4};

        int res = o.getMaior(v);
        assertEquals(10, res);

        org.example.Aula5.PCS.ex4.Mutante1 m1 = new Mutante1();
        res = m1.getMaior(v);
        assertEquals(10, res);
    }

    @Test
    void testMutante2() {
        Original o = new Original();
        int[] v = {10, 90, 10 ,2, 3, 4};

        int res = o.getMaior(v);
        assertEquals(90, res);

        Mutante2 m2 = new Mutante2();
        res = m2.getMaior(v);
        assertEquals(90, res);
    }

    @Test // Este mutante é equivalente, pois ele começa a análise do indice [0],
          // apenas verificando novamente o primeiro elemento
    void testMutante3() {
        Original o = new Original();
        int[] v = {10, 9, 1 ,9, 4, 4};

        int res = o.getMaior(v);
        assertEquals(10, res);

        Mutante3 m3 = new Mutante3();
        res = m3.getMaior(v);
        assertEquals(10, res);
    }

}