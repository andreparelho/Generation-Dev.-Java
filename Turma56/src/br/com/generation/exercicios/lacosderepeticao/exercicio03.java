package br.com.generation.lacosderepeticao;

import java.util.Scanner;

public class exercicio03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int idade = 0, contador21 = 0, contador50 = 0, pessoa = 0;
        String mensagem, mensagem21 = "", mensagem50 = "";

        while (idade != -99) {
            mensagem = "-------------------- " + "\n Digite uma idade para pessoa nº" + (++pessoa) + " :";
            System.out.println(mensagem);
            idade = teclado.nextInt();
            if (idade <= 21 && idade >= 0) {
                contador21++;
                mensagem21 = "Total de pessoas com menos de 21 anos: " + contador21;
            } else if (idade >= 50) {
                contador50++;
                mensagem50 = "Total de pessoas com mais de 50 anos: " + contador50;
            }
        }
        mensagem = "Programa Encerrado.";
        System.out.println(mensagem + "\n" + mensagem21 + "\n" + mensagem50);
    }
}
