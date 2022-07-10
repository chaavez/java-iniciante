package br.com.dev.curso.introducao;

public class EstruturasDeRepeticao01 {

    public static void main(String[] args) {
        //existem tres tipos de estruturas de repetição, sendo elas: while, do while e o for.

        /* o while significa ''enquanto'', a synthax dele é composta por uma expressão booleana dentro, ou seja, uma comparação para ele executar
        determinada atividade*/

        int count = 0;
        int countDo = 0;
        while (count <10) { //while só é executado se a condição for verdadeira, se for falsa, ela será ignorada.
            System.out.println(count);
            count++; //count count+1 out count+= 1, assim fazendo ter um contador para que ele não faça um loop infinito.
        }
        do { //em do while, ele será executado uma vez independente se o while for verdadeiro ou falso, 'do' do verbo fazer
            System.out.println("feito" + countDo);
            countDo++;
        } while (countDo < 5);

        for (int i = 0; i < 10; i++) { /* a expressão é formada por 3 partes, uma variavel int que vai ser mudada conforme o restante da expressão, podendo
        ser um incremento ou decremento etc, a segunda parte que vai ser a condição aonde aquela variavel que vc declarou na primeira parte vai receber
        e a terceira parte que é a parte do incremento ou decremento, variando conforme for escrita, no caso desse exemplo incrementa +1*/
            System.out.println(i);
        }
    }
}
