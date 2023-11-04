# Calculadora JUnit

## Descrição

Classe de calculadora desenvolvida em Java. Testes desenvolvidos utilizando a JUnit 4.

## Funcionalidades

A classe `Calculadora` possuí os seguintes métodos:

* `public int somar(int a, int b)`: Realiza a soma de `a` e `b` e retorna um inteiro.

* `public int subtrair(int a, int b)`: Realiza a subtração de `b` por `a` e retorna um inteiro.

* `public float multiplicar(int a, int b)`: Realiza a multiplicação de `a` por `b` e retorna um número do tipo float.

* `public float dividir(int a, int b)`: Realiza a divisão de `a` por `b` e retorna um número do tipo float.

### Requisitos

Para a utilização do projeto e a realização de seus testes são necessários alguns requisitos:

* Possuir Java instalado em sua máquina
* Possuir Maven instalado em sua máquina

### Testes

Para garantir o correto funcionamento da classe, foram criados testes unitários automatizados utilizando a biblioteca de testes unitários JUnit 4.

### Como executar

* Clonar este repositório:

````bash
git clone https://github.com/vitorbizarra/calculadorajunit.git
````

* Mudar para a branch atual e dar pull no conteúdo:

````bash
git checkout -b calculadorajunittest && git pull origin calculadorajunittest
````

* Rodar os testes

````bash
mvn test -clean
````
