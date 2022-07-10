package br.com.dev.curso.introducao;

public class Arrays01 {
    public static void main(String[] args) {

    //arrays já nao é mais um tipo primitivo por exemplo int, e sim uma referencia (reference)
        //somente refencias podem inicializar  o valor ''null'' por exemplo int[] idades = null; (array é considerado um objeto)
        //por padrao os valores que são atribuidos aos espaços do vetor são: para byte, short, int, long, float e double = 0
        //para o char =  '\u0000' que vai imprimir ' '
        //para boolean = false
        //String = null

        int[] idades = new int[3]; /*se dermos um print nesse array, irá sinalizar um espaço em memoria, ou seja, para eu
        ver um valor eu tenho que estar utilizando a posição do vetor E atribuir um valor a essa posicao, ou seja, declarar dessa forma:*/
        idades[0] = 1;
        idades[1] = 10;
        idades[2] = 15;

    }
}
