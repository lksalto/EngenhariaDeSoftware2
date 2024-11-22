package org.example.Aula5.mutante.ex6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OriginalTest {

    @Test
    void mutante1() {

        //CT passe no programa original
        var o = new Original();
        var res = o.coverterParaRomano(400);

        assertEquals("CD", res);

        //CT falhe no mutante
        var m1 = new Mutante1();
        res = m1.coverterParaRomano(400);

        assertEquals("CD", res);

    }
    @Test
    void mutante2() {

        //CT passe no programa original
        var o = new Original();
        var res = o.coverterParaRomano(1000);

        assertEquals("M", res);

        //CT falhe no mutante
        var m2 = new Mutante2();
        res = m2.coverterParaRomano(1000);

        assertEquals("M", res);

    }
    @Test
    void mutante3() {

        //CT passe no programa original
        var o = new Original();
        var res = o.coverterParaRomano(-1);

        assertEquals("", res);

        //CT falhe no mutante
        var m3 = new Mutante3();
        res = m3.coverterParaRomano(-1);

        assertEquals("", res);

    }
}