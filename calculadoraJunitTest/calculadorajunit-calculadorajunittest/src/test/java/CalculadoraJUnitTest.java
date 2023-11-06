/**
 * Classe de teste para a classe Calculadora.
 * Esta classe contém uma série de cenários de teste para os métodos da classe Calculadora, incluindo somar,
 * subtrair, multiplicar e dividir.
 */

import org.junit.Assert;
import org.junit.Test;

import com.calculadora.Calculadora;

public class CalculadoraJUnitTest {

    private Calculadora calculadora = new Calculadora();

    /**
     * Testa a soma de dois números inteiros positivos.
     */
    @Test
    public void somarDoisNumerosPositivos() {
        int soma = this.calculadora.somar(1, 2);
        Assert.assertEquals(3, soma);
    }

    /**
     * Testa a soma de um número inteiro e zero.
     */
    @Test
    public void somarUmNumeroInteiroEZero() {
        int soma = this.calculadora.somar(3, 0);
        Assert.assertEquals(3, soma);
    }

    /**
     * Testa a soma de um número inteiro e um número negativo.
     */
    @Test
    public void somarNumeroInteiroENumeroNegativo() {
        int soma = this.calculadora.somar(1, -5);
        Assert.assertEquals(-4, soma);
    }

    /**
     * Testa a soma de dois números inteiros negativos.
     */
    @Test
    public void somarDoisNumerosNegativos() {
        int soma = this.calculadora.somar(-2, -2);
        Assert.assertEquals(-4, soma);
    }

    /**
     * Testa a soma de um número negativo e zero.
     */
    @Test
    public void somarNumeroNegativoEZero() {
        int soma = this.calculadora.somar(0, -5);
        Assert.assertEquals(-5, soma);
    }

    /**
     * Testa a soma de dois zeros.
     */
    @Test
    public void somarDoisZeros() {
        int soma = this.calculadora.somar(0, 0);
        Assert.assertEquals(0, soma);
    }

    /**
     * Testa a subtração de um número inteiro de outro número inteiro.
     */
    @Test
    public void subtrairInteiroDeInteiro() {
        int subtracao = this.calculadora.subtrair(2, 1);
        Assert.assertEquals(1, subtracao);
    }

    /**
     * Testa a subtração de zero de um número inteiro.
     */
    @Test
    public void subtrairZeroDeInteiro() {
        int subtracao = this.calculadora.subtrair(1, 0);
        Assert.assertEquals(1, subtracao);
    }

    /**
     * Testa a subtração de um número inteiro de zero.
     */
    @Test
    public void subtrairInteiroDeZero() {
        int subtracao = this.calculadora.subtrair(0, 1);
        Assert.assertEquals(-1, subtracao);
    }

    /**
     * Testa a subtração de zero de zero.
     */
    @Test
    public void subtrairZeroDeZero() {
        int subtracao = this.calculadora.subtrair(0, 0);
        Assert.assertEquals(0, subtracao);
    }

    /**
     * Testa a subtração de um número negativo de um número inteiro.
     */
    @Test
    public void subtrairNegativoDeInteiro() {
        int subtracao = this.calculadora.subtrair(1, -1);
        Assert.assertEquals(2, subtracao);
    }

    /**
     * Testa a subtração de um número negativo de outro número negativo.
     */
    @Test
    public void subtrairNegativoDeNegativo() {
        int subtracao = this.calculadora.subtrair(-1, -1);
        Assert.assertEquals(0, subtracao);
    }

    /**
     * Testa a multiplicação de dois números inteiros.
     */
    @Test
    public void multiplicarInteiroPorInteiro() {
        double multiplicacao = this.calculadora.multiplicar(2, 2);
        Assert.assertEquals(4.0, multiplicacao, 1.0);
    }

    /**
     * Testa a multiplicação de um número inteiro por um número negativo.
     */
    @Test
    public void multiplicarInteiroPorNegativo() {
        double multiplicacao = this.calculadora.multiplicar(2, -2);
        Assert.assertEquals(-4.0, multiplicacao, 1.0);
    }

    /**
     * Testa a multiplicação de um número inteiro por zero.
     */
    @Test
    public void multiplicarInteiroPorZero() {
        double multiplicacao = this.calculadora.multiplicar(2, 0);
        Assert.assertEquals(1.0, multiplicacao, 1.0);
    }

    /**
     * Testa a multiplicação de dois números negativos.
     */
    @Test
    public void multiplicarNegativoPorNegativo() {
        double multiplicacao = this.calculadora.multiplicar(-2, -2);
        Assert.assertEquals(4.0, multiplicacao, 1.0);
    }

    /**
     * Testa a divisão de um número inteiro por outro número inteiro.
     */
    @Test
    public void dividirInteiroPorInteiro() {
        double divisao = this.calculadora.dividir(4, 2);
        Assert.assertEquals(2.0, divisao, 1.0);
    }

    /**
     * Testa a divisão de um número inteiro por um número negativo.
     */
    @Test
    public void dividirInteiroPorNegativo() {
        double divisao = this.calculadora.dividir(2, -2);
        Assert.assertEquals(-1.0, divisao, 1.0);
    }

    /**
     * Testa a divisão de um número inteiro por zero.
     *
     * @throws Exception Se a divisão por zero for detectada, uma exceção será lançada.
     */
    @Test
    public void dividirInteiroPorZero() throws Exception {
        Assert.assertThrows(ArithmeticException.class, () -> this.calculadora.dividir(2, 0));
    }

    /**
     * Testa a divisão de um número negativo por outro número negativo.
     */
    @Test
    public void dividirNegativoPorNegativo() {
        double divisao = this.calculadora.dividir(-2, -2);
        Assert.assertEquals(1.0, divisao, 1.0);
    }
}
