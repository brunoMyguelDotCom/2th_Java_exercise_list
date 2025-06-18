/*
Lista 03 - exercicio 05

Enunciado:
Determinar num conjunto de 3 números o menor deles, imprimindo-o e também o maior deles.
*/

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        // Variaveis
        int a, b, c, maior = 0, menor = 999999999;

        // Input user
        System.out.println("* Digite o valor do primeiro numero: ");
        a = scanner.nextInt();

        System.out.println("* Digite o valor do segundo numero: ");
        b = scanner.nextInt();

        System.out.println("* Digite o valor do terceiro numero: ");
        c = scanner.nextInt();

        // Logica
        maior = a;

        if (a < menor) {
            menor = a;
        }

        if (b > maior) {
            maior = b;
        } else if (b < menor) {
            menor = b;
        }

        if (c > maior) {
            maior = c;
        } else if (c < menor) {
            menor = c;
        }

        // Print
        System.out.println("Numero Maior: %d\nNumero Menor: %d". formatted(maior, menor));
    }
}
