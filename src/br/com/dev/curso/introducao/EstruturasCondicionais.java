package br.com.dev.curso.introducao;

//estruturas condicionais, como o nome já diz, atribuimos condições aos nossos codigos, assim, obtendo resultados diferentes dependendo da situação que o codigo se encontra

public class EstruturasCondicionais {

    public static void main(String[] args) {

        int idade = 10;
        int idadeDois = 18;
        String testeIdade;

        if (idade > 11) { //condição if simples
            System.out.println("verdadeiro1");
        }

        if (idade > 9) { //condição if com else, ou seja, se a primeira condição não for verdadeira, o else, que seria a segunda opção roda
            System.out.println("verdadeiro2");
        } else {
            System.out.println("falso");
        }

        if (idadeDois > 19) { //condicao if com else if, podendo colocar duas ou mais condiçoes para um determinado caso
            System.out.println("verdadeiro3");
        } else if (idade > 1) {
            System.out.println("verdadeiro4");
        } else {
            System.out.println("falso");
        }
        //operador ternário

        testeIdade = idade >= 18 ? "verdadeiro" : "falso"; //o ternário ele faz uma comparação e retorna o resultado dependendo da resposta
        // o '?' é como se fosse o IF e os ':' é como se fosse o else.
        System.out.println(testeIdade);
    }
}
