/*
Lista 03 - exercicio 02

Enunciado:

Em uma empresa, cada funcionário recebe mensalmente o salário bruto mais um prêmio de comissões.

São fornecidos os seguintes valores: salário bruto, prêmio, base do INSS, base do imposto de renda (IR) e suas 
respectivas taxas.

O demonstrativo de pagamento deve incluir o salário bruto, prêmio, rendimento, desconto 
de IR e salário líquido.  

O rendimento é a soma do salário bruto e do prêmio. O desconto do INSS aplica-se se o rendimento exceder a 
base do INSS.

O desconto do IR aplica-se se a diferença entre o rendimento e o desconto do INSS for maior que 
a base do IR.
*/

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        // Variaveis
        float salarioBruto, premio, baseINSS, baseIR, rendimento, salarioLiquido;

        // Input user
        System.out.println("* Digite o salario bruto do funcionario: ");
        salarioBruto = scanner.nextFloat();

        System.out.println("* Digite o valor do premio do funcionario: ");
        premio = scanner.nextFloat();

        System.out.println("* Digite a porcentagem de base do INSS: ");
        baseINSS = scanner.nextFloat();

        System.out.println("* Digite a porcentagem do Imposto de Renda: ");
        baseIR = scanner.nextFloat();

        
        
    }
}
