package br.com.generation.lacosderepeticao;

import java.util.Scanner;

public class exercicio05 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int numero, soma = 0;
        String mensagem;

        do {
            mensagem = "Digite um numero: ";
            System.out.println(mensagem);
            numero = teclado.nextInt();
            soma += numero;
        } while (numero != 0);
        {
            mensagem = "Programa Encerrado!" + "\nSoma dos Numeros Digitados: " + soma;
        }
        System.out.println(mensagem);
    }
}
