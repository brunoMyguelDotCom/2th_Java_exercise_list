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
        float salarioBase, salarioLiquido, premio, rendimento, diferenca_rendimento_e_INSS, baseINSS, baseIR,
                porcentagemDescontoINSS, porcentagemDescontoIR;
        float descontoINSS = 0, descontoIR = 0;

        // Input user
        System.out.println("* Digite o salario bruto do funcionario: ");
        salarioBase = scanner.nextFloat();

        System.out.println("* Digite o valor do premio do funcionario: ");
        premio = scanner.nextFloat();

        System.out.println("* Digite o valor de base do INSS: ");
        baseINSS = scanner.nextFloat();

        System.out.println("* Digite a porcentagem de desconto do INSS: ");
        porcentagemDescontoINSS = scanner.nextFloat();

        System.out.println("* Digite o valor de base do Imposto de Renda: ");
        baseIR = scanner.nextFloat();

        System.out.println("* Digite a porcentagem do Imposto de Renda: ");
        porcentagemDescontoIR = scanner.nextFloat();

        // logica
        rendimento = salarioBase + premio;
        salarioLiquido = rendimento;

        if (rendimento > baseINSS) {
            // calcula descontos
            descontoINSS = salarioLiquido * (porcentagemDescontoINSS / 100);

            /*
             * esta variavel recebe o valor de diferenca entre rendimento e
             * desconto do INSS. Mas tambem e o valor do salario pos desconto do
             * INSS, por isso e utilizada logo a baixo para calcular o desconto do IR, ja
             * que o IR so e calculado pos pagamento do INSS
             */
            diferenca_rendimento_e_INSS = rendimento - descontoINSS;

            if (diferenca_rendimento_e_INSS > baseIR) {
                // calcula descontos
                descontoIR = diferenca_rendimento_e_INSS * (porcentagemDescontoIR / 100);
            }
        }

        salarioLiquido = rendimento - descontoINSS - descontoIR;

        // Print
        System.out.println("""
                    Demonstrativo pagamento:

                    Salario Bruto.......: R$%.2f
                    Premio..............: R$%.2f
                    Rendimento..........: R$%.2f
                    Desconto INSS.......: R$%.2f
                    Desconto IR.........: R$%.2f
                    Salario Liquido.....: R$%.2f
                """.formatted(salarioBase, premio, rendimento, descontoINSS, descontoIR, salarioLiquido));
    }
}
