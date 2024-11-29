package org.example.Aula5.PCS.ex2;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LambdaTest {

    @Test // caminho 1-6
    void testListaVazia()
    {
        Lambda lambda = new Lambda();

        List<String> lst = List.of();
        int[] res = lambda.countWordsStartingWithAandZ(lst);
        assertArrayEquals(new int[]{0, 0}, res);
    }

    @Test // caminho 1-2-4-1-6
    void testListaComOutrasLetras()
    {
        Lambda lambda = new Lambda();

        List<String> lst= List.of("arroz", "mamão", "zebra", "abacate");
        int[] res = lambda.countWordsStartingWithAandZ(lst);
        assertArrayEquals(new int[]{2, 1}, res);
    }

    @Test // caminho: 1-2-3-2-4-5-6
    void testContendoAeZ() {
        Lambda lambda = new Lambda();

        List<String> res = List.of("arroz", "zebra", "abacate", "zoom");
        int[] lst = lambda.countWordsStartingWithAandZ(res);
        assertArrayEquals(new int[]{2, 2}, lst);

    }



}