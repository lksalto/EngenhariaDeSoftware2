package org.example.Aula5.PCS.ex2;

import java.util.List;

public class Lambda {

    /**
     * Counts how many words start with 'a' and 'z'.
     *
     * @param strings a list of strings to analyze
     * @return an array with two integers: the count of words starting with 'a' and 'z', respectively
     */
    public int[] countWordsStartingWithAandZ(List<String> strings) {
        int[] ret = {0, 0};
        /*1*/
        /*1*/strings.stream().forEach(s -> {
            if (/*2*/s.startsWith("a")) {
                /*3*/ret[0]++;
            } else if (/*4*/s.startsWith("z")) {
                /*5*/ret[1]++;
            }
        });
        /*6*/
        return ret;
    }
}
