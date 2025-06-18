/*
Lista 03 - exercicio 03

Enunciado:

Ler duas variáveis A e B, se a variável A for menor que B, fazer Y= B – A, se B for menor que A fazer Y= A – B, 
caso sejam iguais fazer Y = A + B, imprimir no final os valores de A, B e Y. 
*/

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        // Variaveis
        int a = 0, b = 0, y = 0;

        // Input user
        System.out.println("* Digite o valor de A: ");
        a = scanner.nextInt();

        System.out.println(" * Digite o valor de B: ");
        b = scanner.nextInt();

        // Logica
        if (a < b) {
            y = b - a;
        } else if (b < a) {
            y = a - b;
        } else if (a == b) {
            y = a + b;
        }

        // Print
        System.out.println("""
        Valor de A: %d
        Valor de B: %d
        Valor de Y: %d
        """.formatted(a, b, y));
    }
}
