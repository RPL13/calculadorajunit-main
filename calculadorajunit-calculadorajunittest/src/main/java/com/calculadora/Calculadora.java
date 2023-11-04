package com.calculadora;

/**
 * Classe calculadora que reailiza as quatro operações básicas
 * da matemática: Soma, subtração, divisão e multiplicação
 */
public class Calculadora {
    /**
     * Realiza a soma de dois números inteiros
     * 
     * @param a
     * @param b
     * @return
     */
    public int somar(int a, int b) {
        return a + b;
    }

    /**
     * Realiza a subtração de dois números inteiros
     * 
     * @param a
     * @param b
     * @return
     */
    public int subtrair(int a, int b) {
        return a - b;
    }

    /**
     * Realiza a multiplicação de dois números inteiros
     * 
     * @param a
     * @param b
     * @return
     */
    public double multiplicar(int a, int b) {
        return a * b;
    }

    /**
     * Realiza a divisão de dois números inteiros
     * 
     * @param a
     * @param b
     * @return
     */
    public double dividir(int a, int b) {
        return a / b;
    }
}
