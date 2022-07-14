package br.com.generation.exercicios.poo.projeto;

import java.util.Scanner;

public class DiagnosticoTest {
    public static void main(String[] args) throws InterruptedException {
        int pontuacao1 = 0, pontuacao2 = 0, pontuacao3 = 0, pontuacaoTotal = 0;
        int sintomas = 0;

        Scanner entrada = new Scanner(System.in);

        do {
            System.out.println("Na ultima semana você apresentou quantos desses sintomas leves?");
            // cada sintoma equivale a +1 pontuação
            System.out.println("- Febre");
            System.out.println("- Tosse");
            System.out.println("- Cansaço");
            System.out.println("- Perda de paladar ou olfato");

            System.out.print("Digite a quantidade de sintomas: ");
            sintomas = entrada.nextInt();
            pontuacaoTotal = sintomas;
            if (pontuacaoTotal > 4) {
                System.out.println("\n" + "Erro. Digite novamente!" + "\n");
            }
        } while (pontuacaoTotal > 4);

        System.out.println("---------------------------------------------------------");

        do {
            System.out.println("Na ultima semana você apresentou quantos desses sintomas moderados?");
            System.out.println("- Dores de garganta");
            System.out.println("- Dor de cabeça");
            System.out.println("- Dores e desconfortos");
            System.out.println("- Diarreia");
            System.out.println("- Irritações na pele ou descoloração dos dedos dos pés ou das mãos");
            System.out.println("- Olhos vermelhos ou irritados");

            System.out.print("Digite a quantidade de sintomas: ");

            sintomas = entrada.nextInt();
            pontuacao2 = sintomas * 2;
            pontuacaoTotal += pontuacao2;
            if (sintomas > 6) {
                System.out.println("\n" + "Erro. Digite novamente!" + "\n");
            }
        } while (sintomas > 6);

        System.out.println("---------------------------------------------------------");

        do {
            // cada sintoma equivale a pontuação*3
            System.out.println("Na ultima semana você apresentou quantos desses sintomas graves?");
            System.out.println("- Dificuldade para respirar ou falta de ar");
            System.out.println("- Perda da fala, mobilidade ou confusão");
            System.out.println("- Dores no peito");

            System.out.print("Digite digite a quantidade de sintomas: ");

            sintomas = entrada.nextInt();
            pontuacao3 = sintomas * 3;
            pontuacaoTotal += pontuacao3;
            if (sintomas > 3) {
                System.out.println("\n" + "Erro. Digite novamente!" + "\n");
            }
        } while (sintomas > 3);

        for (int i = 0; i < 10; i++) {
            String processando = ".";
            System.out.print(processando);
            Thread.sleep(500);
        }
        if (pontuacaoTotal <= 5) {
            System.out.println("\nVocê apresenta sintomas leves, tome cuidado!");
        } else if (pontuacaoTotal >= 6 && pontuacaoTotal <= 15) {
            System.out.println("\nVocê apresenta sintomas moderados, tome cuidado!");
        } else {
            System.out.println("\nVocê apresenta sintomas graves, tome cuidado!");
        }
    }
}
