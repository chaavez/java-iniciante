package br.com.dev.curso.introducao;

public class EstruturasDeRepeticaoContinue {

    public static void main(String[] args) {

        int valorMax = 50;

        for (int i = 0; i < valorMax; i++) {
            if (i < 25) {
                continue;
            }
            System.out.println(i);
        }
    }
}
