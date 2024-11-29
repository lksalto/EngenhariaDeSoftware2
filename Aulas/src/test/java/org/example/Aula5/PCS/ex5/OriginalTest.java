package org.example.Aula5.PCS.ex5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OriginalTest {

    @Test
    void Mutante1() {
        Original o = new Original();
        Mutante1 m = new Mutante1();

        assertEquals(3, o.contarA("Abacate"));

        assertEquals(3, m.contarA("Abacate"));

    }

    @Test // O mutante2 é equivalente, pos o contador++ e o contador = contador + 1 são equivalentes neste caso
    void Mutante2() {
        Original o = new Original();
        Mutante2 m = new Mutante2();

        assertEquals(0, o.contarA("TESTE"));

        assertEquals(0, m.contarA("TESTE"));
    }

    @Test
    void Mutante3() {
        Original o = new Original();
        Mutante3 m = new Mutante3();

        assertEquals(2, o.contarA("PAMONHA"));

        assertEquals(2, m.contarA("PAMONHA"));

    }
}