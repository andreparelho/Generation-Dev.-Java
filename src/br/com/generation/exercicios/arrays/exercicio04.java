package br.com.generation.exercicios.arrays;

import java.util.Scanner;

public class exercicio04 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int[][] matriz = new int[3][3];
        int soma = 0, somaDiagonal = 0;
        String mensagem = "Digite três numeros: ";

        for (int i = 0; i < matriz.length; i++) {
            System.out.print(mensagem);
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = teclado.nextInt();
                soma += matriz[i][j];
                somaDiagonal = matriz[0][0] + matriz[1][1] + matriz[2][2];
            }
        }
        mensagem = "Valor da Soma das Matrizes = " + soma + "\nValor da Soma das Diagonais = " + somaDiagonal;
        System.out.println(mensagem);
    }
}
