package org.example.Aula5.PCS.ex4;

public class Mutante3 {

    public int getMaior(int vetor[]) {
        int maior = vetor[0];
        for (int i = 0; i < vetor.length; i++) {
            if(vetor[i] > maior)
                maior = vetor[i];
        }
        return maior;
    }
}
