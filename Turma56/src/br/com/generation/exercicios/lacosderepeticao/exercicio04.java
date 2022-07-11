package br.com.generation.lacosderepeticao;

import java.util.Scanner;

public class exercicio04 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int idade, opcao = 0, pessoas = 0, contPessoasCalm = 0, contMulheresNerv = 0, contHomensAgres = 0,
                contOutrosCalm = 0, contPessoasNerv40 = 0, contPessoasCalm18 = 0;
        char sexo;
        String mensagem, msgPessoasCalm = "", msgMulheresNerv = "", msgHomensAgres = "",
                msgOutrosCalm = "", msgPessoasNerv40 = "", msgPessoasCalm18 = "";

        while (pessoas <= 150) {
            mensagem = "Digite sua idade: ";
            System.out.println(mensagem);
            idade = teclado.nextInt();

            mensagem = "(DIGITE O NUMERO DA OPÇÃO) Digite seu sexo " + "\n1. Feminino" + "\n2. Masculino" + "\n3. Outro(a)";
            System.out.println(mensagem);
            sexo = teclado.next().charAt(0);

            mensagem = "(DIGITE O NUMERO DA OPÇÃO) Voce se considera: " + "\n1. Pessoa Calma" + "\n2. Pessoa Nervosa" + "\n3. Pessoa Agressiva";
            System.out.println(mensagem);
            opcao = teclado.nextInt();
            if (opcao == 1) {
                contPessoasCalm++;
                msgPessoasCalm = "Numero de Pessoas Calmas : " + contPessoasCalm;
            } if (sexo == '1' && opcao == 2) {
                contMulheresNerv++;
                msgMulheresNerv = "Numero de Mulheres Nervosas: " + contMulheresNerv;
            } if (sexo == '2' && opcao == 3) {
                contHomensAgres++;
                msgHomensAgres = "Numero de Homens Agressivos: " + contHomensAgres;
            } if (sexo == '3' && opcao == 3) {
                contOutrosCalm++;
                msgOutrosCalm = "Numero de Outros Calmas: " + contOutrosCalm;
            } if (idade >= 40 && opcao == 2) {
                contPessoasNerv40++;
                msgPessoasNerv40 = "Numero de Pessoas Nervosas com mais de 40 anos: " + contPessoasNerv40;
            } if (idade <= 18 && opcao == 3) {
                contPessoasCalm18++;
                msgPessoasCalm18 = "Numero de Pessoas Calmas com menos de 18 anos: " + contPessoasCalm18;
            }
            pessoas++;
        }
        System.out.print(msgPessoasCalm + "\n" + msgMulheresNerv + "\n" + msgHomensAgres +
                "\n" + msgOutrosCalm + "\n" + msgPessoasNerv40 + "\n" + msgPessoasCalm18);
    }
}
