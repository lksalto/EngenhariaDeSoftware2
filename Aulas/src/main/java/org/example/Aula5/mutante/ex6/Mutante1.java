package org.example.Aula5.mutante.ex6;

public class Mutante1 {
    int[] num = { 1000, 900, 500, 400, 100, 90, 50, 40,
            10, 9, 5, 4, 1 };
    String[] rom = { "M", "CM", "D", "Cd", "C", "XC", "L",
            "XL", "X", "IX", "V", "IV", "I" };
    public String coverterParaRomano(int numero) {
        var ret = "";
        var i = 0;
        while (numero > 0) {
            if (numero >= num[i]) {
                ret += rom[i];
                numero -= num[i];
            } else {
                i++;
            }
        }
        return ret;
    }
}