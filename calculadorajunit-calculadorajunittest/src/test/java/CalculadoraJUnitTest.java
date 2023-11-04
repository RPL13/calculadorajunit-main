import org.junit.Assert;
import org.junit.Test;

import com.calculadora.Calculadora;

public class CalculadoraJUnitTest {

    private Calculadora calculadora = new Calculadora();

    @Test
    public void somarDoisNumerosPositivos() {
        int soma = this.calculadora.somar(1, 2);
        Assert.assertEquals(3, soma);
    }

    @Test
    public void somarUmNumeroInteiroEZero() {
        int soma = this.calculadora.somar(3, 0);
        Assert.assertEquals(3, soma);
    }

    @Test
    public void somarNumeroInteiroENumeroNegativo() {
        int soma = this.calculadora.somar(1, -5);
        Assert.assertEquals(-4, soma);
    }

    @Test
    public void somarDoisNumerosNegativos() {
        int soma = this.calculadora.somar(-2, -2);
        Assert.assertEquals(-4, soma);
    }

    @Test
    public void somarNumeroNegativoEZero() {
        int soma = this.calculadora.somar(0, -5);
        Assert.assertEquals(-5, soma);
    }

    @Test
    public void somarDoisZeros() {
        int soma = this.calculadora.somar(0, 0);
        Assert.assertEquals(0, soma);
    }

    @Test
    public void subtrairInteiroDeInteiro() {
        int subtracao = this.calculadora.subtrair(2, 1);
        Assert.assertEquals(1, subtracao);
    }

    @Test
    public void subtrairZeroDeInteiro() {
        int subtracao = this.calculadora.subtrair(1, 0);
        Assert.assertEquals(1, subtracao);
    }

    @Test
    public void subtrairInteiroDeZero() {
        int subtracao = this.calculadora.subtrair(0, 1);
        Assert.assertEquals(-1, subtracao);
    }

    @Test
    public void subtrairZeroDeZero() {
        int subtracao = this.calculadora.subtrair(0, 0);
        Assert.assertEquals(0, subtracao);
    }

    @Test
    public void subtrairNegativoDeInteiro() {
        int subtracao = this.calculadora.subtrair(1, -1);
        Assert.assertEquals(2, subtracao);
    }

    @Test
    public void subtrairNegativoDeNegativo() {
        int subtracao = this.calculadora.subtrair(-1, -1);
        Assert.assertEquals(0, subtracao);
    }

    @Test
    public void multiplicarInteiroPorInteiro() {
        double subtracao = this.calculadora.multiplicar(2, 2);
        Assert.assertEquals(4.0, subtracao, 1.0);
    }

    @Test
    public void multiplicarInteiroPorNegativo() {
        double subtracao = this.calculadora.multiplicar(2, -2);
        Assert.assertEquals(-4.0, subtracao, 1.0);
    }

    @Test
    public void multiplicarInteiroPorZero() {
        double subtracao = this.calculadora.multiplicar(2, 0);
        Assert.assertEquals(1.0, subtracao, 1.0);
    }

    @Test
    public void multiplicarNegativoPorNegativo() {
        double subtracao = this.calculadora.multiplicar(-2, -2);
        Assert.assertEquals(4.0, subtracao, 1.0);
    }

    @Test
    public void multiplicarZeroPorZero() {
        double subtracao = this.calculadora.multiplicar(0, 0);
        Assert.assertEquals(0.0, subtracao, 1.0);
    }

    @Test
    public void dividirInteiroPorInteiro() {
        double subtracao = this.calculadora.dividir(4, 2);
        Assert.assertEquals(2.0, subtracao, 1.0);
    }

    @Test
    public void dividirInteiroPorNegativo() {
        double subtracao = this.calculadora.dividir(2, -2);
        Assert.assertEquals(-1.0, subtracao, 1.0);
    }

    @Test
    public void dividirInteiroPorZero() throws Exception {
        Assert.assertThrows(ArithmeticException.class, () -> this.calculadora.dividir(2, 0));
    }

    @Test
    public void dividirNegativoPorNegativo() {
        double subtracao = this.calculadora.dividir(-2, -2);
        Assert.assertEquals(1.0, subtracao, 1.0);
    }
}
