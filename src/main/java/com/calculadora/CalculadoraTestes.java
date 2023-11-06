/**
 * *@author Raphael Vicentini
 * @version 1.03
 * @since Realese 1.02 da Aplicação
 * 
 * Classe de teste para a classe Calculadora.
 * Esta classe contém cenários de testes para os métodos de somar, subtrair, multiplicar e dividir
 * da classe Calculadora.
 */
package com.calculadora;

public class CalculadoraTestes {
    public static void main(String[] args) throws Exception {
        Calculadora calc = new Calculadora();

        // Método somar()
        System.out.println("Método somar(): \n");
        
        // Cenário de testes 1: Soma de dois valores inteiros (10)
        int soma = calc.somar(3, 7);
        System.out.println(soma);

        // Cenário de testes 2: Soma de um inteiro e zero (3)
        soma = calc.somar(3, 0);
        System.out.println(soma);

        // Cenário de testes 3: Soma de um inteiro e um negativo (-4)
        soma = calc.somar(1, -5);
        System.out.println(soma);

        // Cenário de testes 4: Soma de dois negativos (-4)
        soma = calc.somar(-2, -2);
        System.out.println(soma);

        // Cenário de testes 5: Soma de um negativo e zero (-5)
        soma = calc.somar(-5, 0);
        System.out.println(soma);

        // Cenário de testes 6: Soma de dois zeros (0)
        soma = calc.somar(0, 0);
        System.out.println(soma);

        // Método subtrair()
        System.out.println("\nCenário de testes 7: Subtrair dois números inteiros (1)");
        int subtracao = calc.subtrair(2, 1);
        System.out.println(subtracao);

        // Cenário de testes 8: Subtrair zero de inteiro (1)
        subtracao = calc.subtrair(1, 0);
        System.out.println(subtracao);

        // Cenário de testes 9: Subtrair inteiro de zero (-1)
        subtracao = calc.subtrair(0, 1);
        System.out.println(subtracao);

        // Cenário de testes 10: Subtrair zero de zero (0)
        subtracao = calc.subtrair(0, 0);
        System.out.println(subtracao);

        // Cenário de testes 11: Subtrair negativo de inteiro (2)
        subtracao = calc.subtrair(1, -1);
        System.out.println(subtracao);

        // Cenário de testes 12: Subtrair negativo de negativo (0)
        subtracao = calc.subtrair(-1, -1);
        System.out.println(subtracao);

        // Método multiplicar()
        System.out.println("\nCenário de testes 13: Multiplicar dois números inteiros (4)");
        double multiplicacao = calc.multiplicar(2, 2);
        System.out.println(multiplicacao);

        // Cenário de testes 14: Multiplicar número inteiro por negativo (-4)
        multiplicacao = calc.multiplicar(2, -2);
        System.out.println(multiplicacao);

        // Cenário de testes 15: Multiplicar inteiro por zero (1)
        multiplicacao = calc.multiplicar(2, 0);
        System.out.println(multiplicacao);

        // Cenário de testes 16: Multiplicar dois números negativos (4)
        multiplicacao = calc.multiplicar(-2, -2);
        System.out.println(multiplicacao);

        // Cenário de testes 17: Multiplicar dois zeros (0)
        multiplicacao = calc.multiplicar(0, 0);
        System.out.println(multiplicacao);

        // Método dividir()
        System.out.println("\nCenário de testes 18: Dividir inteiro por inteiro (2)");
        double divisao = calc.dividir(4, 2);
        System.out.println(divisao);

        // Cenário de testes 19: Dividir inteiro por negativo (-1)
        divisao = calc.dividir(2, -2);
        System.out.println(divisao);

        // Cenário de testes 20: Dividir inteiro por zero (Exception)
        // divisao = calc.dividir(2, 0);
        // System.out.println(divisao);

        // Cenário de testes 21: Dividir negativo por negativo (1)
        divisao = calc.dividir(-2, -2);
        System.out.println(divisao);
    }
}