package org.example.Aula5.PCS.ex5;

public class Mutante3 {
    public int contarA(String word) {
        int contador = 0;
        for(int i = 0; i < word.length()-1; i++) {
            if(word.charAt(i) == 'a' || word.charAt(i) == 'A')
                contador++;
        }        return contador;
    }
}
