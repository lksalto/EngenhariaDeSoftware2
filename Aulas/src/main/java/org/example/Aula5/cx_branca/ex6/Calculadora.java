package org.example.Aula5.cx_branca.ex6;

public class Calculadora {
    /**
     * @param vetor
     * @param inicioInterv deve ser >= 0 e menor que fimInterv
     * @param fimInterv deve ser >= 0 e maior que inicioInterv
     * @return (i) media dos inteiros do vetor que estão no intervalo [inicioInterv, fimInterv]
     * (ii) -1 se os parametros forem invalidos
     */

    //primeiro enumerar os blocos de código

    public float calcularMedia(int vetor[], int inicioInterv, int fimInterv) {
        /*1*/if (inicioInterv < 0 || /*2*/fimInterv < 0)
            /*3*/return -1;

        /*4*/if (inicioInterv >= fimInterv)
            /*5*/return -1;


        //condicao que implica na outra, por isso os dois sao 6
        /*6*/float soma = 0, n = 0;
        for (/*6*/int i = 0; /*7*/i < vetor.length; /*8*/i++) {
            if(/*9*/vetor[i] >= inicioInterv && /*10*/vetor[i] <= fimInterv) {
                /*11*/soma = soma + vetor[i];
                /*11*/n++;
            }
        }
        /*12*/return soma/n;
    }
}
