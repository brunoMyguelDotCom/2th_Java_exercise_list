/*
Lista 03 - exercicio 01

Enunciado:

Faça um programa que lendo o nome, idade em anos e sexo de um associado de um clube concede desconto 
na mensalidade a ser paga, observando: 
sexo feminino  até 30 anos desconto  de 20%  
sexo feminino  31 a 40 anos desconto de 30% 
sexo feminino  acima de 41 anos desconto de 35% 

sexo masculino até 25 anos sem desconto 
sexo masculino acima de 25 anos desconto de 25%. 
 
Forneça nome, idade e mensalidade a pagar. 
*/

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        // Variaveis
        String nome, inputSexo;
        char sexo;
        int idade;
        float mensalidade, desconto = 0, descontoReais, valorAPagar;

        // Input
        System.out.println("* Digite o nome do associado: ");
        nome = scanner.nextLine();

        System.out.println("* Digite a idade do associado: ");
        idade = scanner.nextInt();
        // Limpa o buffer permitindo proxima leitura
        scanner.nextLine();

        // Tratamento de erro, input incorreto
        do {
            System.out.println("* Digite o sexo do associado (F - Feminino // M - Masculino): ");
            /*
             * Variavel String recebe o caractere, variavel char importa o primeiro
             * caractere da String como casting
             */
            inputSexo = scanner.nextLine();
            sexo = inputSexo.charAt(0);

            if (sexo != 'm' && sexo != 'M' && sexo != 'f' && sexo != 'F') {
                System.out.println("Input incorreto! Coloque: F - Feminino ou M - Masculino");
            }
        } while (sexo != 'm' && sexo != 'M' && sexo != 'f' && sexo != 'F');

        System.out.println("* Digite o valor original da mensalidade: ");
        mensalidade = scanner.nextFloat();

        // Logica
        if (sexo == 'f' || sexo == 'F') {

            inputSexo = "FEMININO";

            if (idade <= 30) {
                desconto = (float) 0.20;
            } else if (idade >= 31 && idade <= 40) {
                desconto = (float) 0.30;
            } else {
                desconto = (float) 0.35;
            }

        } else if (sexo == 'm' || sexo == 'M') {

            inputSexo = "MASCULINO";

            if (idade >= 25) {
                desconto = (float) 0.25;
            }
        }

        valorAPagar = mensalidade - (mensalidade * desconto);
        descontoReais = mensalidade - valorAPagar;

        // Print
        System.out.println("""
                NOME DO ASSOCIADO: %s
                SEXO DO ASSOCIADO: %s
                IDADE DO ASSOCIADO: %d

                VALOR ORIGINAL DA MENSALIDADE: R$%.2f
                DESCONTO: R$%.2f

                VALOR A PAGAR: R$%.2f
                """.formatted(nome, inputSexo, idade, mensalidade, descontoReais, valorAPagar));
    }
}
