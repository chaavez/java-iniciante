package br.com.dev.curso.introducao;

public class EstruturasDeRepeticaoBreak {
    //imprima os primeiros 25 numeros de um dado valor.
    public static void main(String[] args) {


        int valorMax = 50;

        for (int i = 0; i < valorMax; i++) {
            if (i > 25) {
                break; //não podemos usar um break fora de um laço de repetição
                /*o break serve para QUEBRAR o bloco de comando, assim evitando que ele faça
               o processo ''por baixo dos panos'', assim economizando processamento*/
            }
            System.out.println(i);
        }

        //dado o valor de um carro, descubra em quantas vezes ele pode ser parcelado por 1000 reais

        double valorCarro = 20000;

        for (int parcela = 1; parcela < valorCarro; parcela++) {
            double valorParcela = valorCarro / parcela;
            if (valorParcela >= 1000) {
                System.out.println(parcela + " RS " + valorParcela);
                } else {
                break;
            }
        }
    }
}
