package br.com.generation.lacosderepeticao;

import java.util.Scanner;

public class exercicio02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int pares = 0, impares = 0, numero = 0;
        String mensagem = "Digite um numero: ", mensagemPar = "", mensagemImpar = "";

        for (int i = 1; i <= 5 ; i++) {
            System.out.println(mensagem);
            numero = teclado.nextInt();
            if (numero % 2 == 0) {
                pares++;
                mensagemPar = "Numero pares: " + pares;
            } else if (numero % 2 > 0) {
                impares++;
                mensagemImpar = "Numero impares: " + impares;
            }
        }
        System.out.println(mensagemPar);
        System.out.println(mensagemImpar);
    }
}
