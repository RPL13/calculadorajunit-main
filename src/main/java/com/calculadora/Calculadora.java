/**
 * *@author Raphael Vicentini
 * @version 1.03
 * @since Realese 02/11/2023
 * 
 * Classe Calculadora
 * Esta classe implementa operações matemáticas simples, como soma, subtração, multiplicação e divisão.
 */
package com.calculadora;

public class Calculadora {
    /**
     * Realiza a operação de soma entre dois números inteiros.
     *
     * @param a O primeiro número inteiro a ser somado.
     * @param b O segundo número inteiro a ser somado.
     * @return A soma dos dois números inteiros.
     */
    public int somar(int a, int b) {
        return a + b;
    }

    /**
     * Realiza a operação de subtração entre dois números inteiros.
     *
     * @param a O número inteiro do qual o segundo número será subtraído.
     * @param b O número inteiro a ser subtraído do primeiro número.
     * @return A diferença entre os dois números inteiros.
     */
    public int subtrair(int a, int b) {
        return a - b;
    }

    /**
     * Realiza a operação de multiplicação entre dois números inteiros.
     *
     * @param a O primeiro número inteiro a ser multiplicado.
     * @param b O segundo número inteiro a ser multiplicado.
     * @return O produto dos dois números inteiros.
     */
    public double multiplicar(int a, int b) {
        return a * b;
    }

    /**
     * Realiza a operação de divisão entre dois números inteiros.
     *
     * @param a O numerador, o número do qual será realizada a divisão.
     * @param b O denominador, o número pelo qual o numerador será dividido.
     * @return O resultado da divisão como um valor de ponto flutuante (double).
     * @throws ArithmeticException Se a divisão por zero for detectada, uma exceção será lançada.
     */
    public double dividir(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Não é possível dividir por zero.");
        }
        return (double) a / b;
    }
}

