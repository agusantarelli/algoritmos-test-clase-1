package com.redbee.academy.clase1;

public class Potencia {

    /**
     * Generar un algoritmo para elevar un número (base) a una potencia dada
     *
     * @param base
     * @param potencia
     * @return
     */
    public static Integer resolver(Integer base, Integer potencia) {
        int pot = 1;
        int i = 0;
        while(i < potencia){
            pot *= base;
            i++;
        }
        return pot;
    }
}
