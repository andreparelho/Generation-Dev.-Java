package br.com.generation.exercicios.arrays;

import java.util.Random;

public class exercicio03 {
    public static void main(String[] args) {
        Random aleatorio = new Random();

        int[][] n1 = new int[4][6], n2 = new int[4][6], m1 = new int[4][6], m2 = new int[4][6];
        int soma, subtracao;


        for (int i = 0; i < n1.length; i++) {
            for (int j = 0; j < n1[i].length; j++) {
                n1[i][j] = aleatorio.nextInt(10) + 1;
                System.out.print(n1[i][j] + "|");
            }
            System.out.println();
        }
        System.out.println("-------------");
        for (int i = 0; i < n2.length; i++) {
            for (int j = 0; j < n2[i].length; j++) {
                n2[i][j] = aleatorio.nextInt(10) + 1;
                System.out.print(n2[i][j] + "|");
            }
            System.out.println();
        }
        System.out.println("-------------");
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[i].length; j++) {
                soma = n1[i][j] + n2[i][j];
                System.out.print(soma + "|");
            }
            System.out.println();
        }
        System.out.println("-------------");
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[i].length; j++) {
                subtracao = n1[i][j] - n2[i][j];
                System.out.print(subtracao + "|");
            }
            System.out.println();
        }
        System.out.println();
    }

}
