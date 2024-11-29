package org.example.Aula5.PCS.ex1;

public class Calculadora {

    public int somatoriaLimitada(int n, int valorMaximo) throws Exception {
        /*1*/
        int resultado = 0, i = 0;
        if(/*1*/n < 0)
        {
            /*2*/ n = -n;
        }
        while(/*3*/i<=n && /*4*/resultado <= valorMaximo) {
            /*5*/resultado = resultado + i;
            /*5*/i++;
        }
        if(/*6*/resultado > valorMaximo)
            /*7*/throw new Exception("valor maximo foi ultrapassado");
        else
            /*8*/return resultado;
    }
}