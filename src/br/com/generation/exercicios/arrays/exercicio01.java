package br.com.generation.exercicios.arrays;

import java.util.Scanner;

public class exercicio01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int[] array = new int[5];
        int pontuacao = 0;
        String mensagem = "Digite um numero: ";

        for (int i = 0; i < array.length; i++) {
            System.out.println(mensagem);
            array[i] = teclado.nextInt();
            if (pontuacao < array[i]) {
                pontuacao = array[i];
            }
        }
        mensagem = "Maior pontuação = " + pontuacao;
        System.out.println(mensagem);
    }
}
