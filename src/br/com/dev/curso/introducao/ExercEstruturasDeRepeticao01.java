package br.com.dev.curso.introducao;

import org.w3c.dom.ls.LSOutput;

public class ExercEstruturasDeRepeticao01 {
    public static void main(String[] args) {
        //imprima todos os numeros pares de 0 a 1000000

        /* EXEMPLO FOR
        for (int i = 0; i < 1000000; i++) {
            if (i%2 == 0) {
                System.out.println(i);
            }
        }*/

        /* EXEMPLO WHILE
        int numero = 0;

                while (numero < 1000000) {
                    numero++;
                            if(numero%2 == 0) {
                                System.out.println(numero);
                            }
                }*/
        //EXEMPLO DO WHILE
        int numero = 0;

        do {
            numero++;
           if (numero% 2 == 0) {
               System.out.println(numero);
           }
        } while (numero < 1000000); {

        }
    }
}
