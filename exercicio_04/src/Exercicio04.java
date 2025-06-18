/*
Lista 03 - exercicio 04

Enunciado:

Considerar três notas inteiras, encontrar a Média aritmética simples, entre as notas que correspondem aos 
números, deixando de fora da media as notas impares. Se nenhuma for PAR emita a mensagem “NENHUMA 
NOTA PAR”. 
*/

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        // Variaveis
        float nota01 = 0, nota02 = 0, nota03 = 0, numeroNotasPares = 0, somaDasNotas = 0, mediaFinal = 0;

        // Input user1

        System.out.println("* Digite o valor da 1º nota: ");
        nota01 = scanner.nextFloat();

        System.out.println("* Digite o valor da 2º nota: ");
        nota02 = scanner.nextFloat();

        System.out.println("* Digite o valor da 3º nota: ");
        nota03 = scanner.nextFloat();

        // Logica
        if (nota01 % 2 == 0) {
            numeroNotasPares++;
            somaDasNotas += nota01;
        }
        if (nota02 % 2 == 0) {
            numeroNotasPares++;
            somaDasNotas += nota02;
        }
        if (nota03 % 2 == 0) {
            numeroNotasPares++;
            somaDasNotas += nota03;
        }

        mediaFinal = somaDasNotas / numeroNotasPares;

        // Print
        if (numeroNotasPares == 0) {
            System.out.println("Nenhuma nota par!");
        } else {
            System.out.printf("* Media final das notas pares: %.2f\n\n", mediaFinal);
        }
    }
}
