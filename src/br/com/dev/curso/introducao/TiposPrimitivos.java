package br.com.dev.curso.introducao;

import org.w3c.dom.ls.LSOutput;

public class TiposPrimitivos {

    /* esses são os tipos primitivos existentes em java:
     byte -> para numeros inteiros
     short -> para numeros inteiros
     int -> para numeros inteiros
     long -> para numeros inteiros

     float -> para numeros reais
     double -> para numeros reais

obs: note que existe 4 para numeros inteiros e 2 para numeros com ponto flutuante(reais)
o que muda de um para outro é a quantidade de memória que é utilizado para descrever a variavel
sendo assim, cada um deles existem uma limitação, porém podemos utilizar o mais proximo para uma
função, assim ocupando menos memória.

     char -> para caracteres obs: especificamente 1

     boolean -> para verdadeiro(true) ou falso(false)

     sendo assim o exemplo abaixo:
      */
    public static void main(String[] args) {

        byte numero = 1;
        short numeroDois = 2;
        int numeroTres = 3;
        long numeroQuatro = 4;

        float salario = 100.5f;
        double salarioDois = 150.7;

        char letra = 'A'; //note que nesse caso de tipo primitivo devemos usar aspas simples

        boolean falso = false;
        boolean verdadeiro = true;

        /*o tipo String, é um tipo de referencia, porem ''parecido'' com o char, so que ao inves de armazenar somente 1 caracter
        voce vai armazenar diversos, assim criando frases etc
        obs: devemos utilizar aspas duplas nesse caso.
        */

        String nome = "Anderson"; //(String é uma classe)

    }
}
