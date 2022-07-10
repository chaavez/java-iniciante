package br.com.dev.curso.introducao;

public class OperadoresJava {
    public static void main(String[] args) {
        //como na matematica, aqui temos os operadores aritmeticos, sendo eles + = soma - = subtração / = divisão e * = multiplicação o % serve para saber o resto de uma divisao
        double numero1 = 10;
        double numero2 = 20;
        double resultado = numero1 + numero2;
        //resultado = numero1 - numero2;
        //resultado = numero1 * numero2;
        //resultado = numero1 / numero2;
        //tambem podemos usar o cast e forçar um numero virar inteiro (a variavel está declarada como double)
        //resultado = numero1 / (int) numero2;

        //alem de operadores aritmeticos, temos operadores logicos sendo eles o > (maior) >= (maior igual) < (menor) <= (menor igual)  == (igualdade/comparação) != (diferente)

        int a = 10;
        int b = 20;
        boolean c;

        /*c = a > b
        c = a>= b
        c = a< b
        c = a <= b
        c = a != b
        c = a == b
         alem desses operadores logicos, temos tambem os operadores logicos and or ou not
        and = &&
        or = ||
        not !
         */

        //atribuição com operadores logicos, serve para ''escrevermos menos codigo'' pois reduzimos a expressão que digitamos por exem

        int d = 10;
        d =  d + a; //ao inves de escrevermos assim, podemos diminuir a expressão atribuindo a soma junto com o outra variavel por ex
        d += a; // é a mesma coisa que o exemplo acima, mas de um jeito menos verboso. assim vale para os demais operadores aritmeticos
        // -= += /= *= %=
    }
}
