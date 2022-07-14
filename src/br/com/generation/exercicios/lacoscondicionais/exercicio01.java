package br.com.generation.lacoscondicionais;

import java.util.Scanner;

public class exercicio01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int numero1, numero2, numero3;
        String mensagem;

        mensagem = "Digite um numero: ";
        System.out.println(mensagem);
        numero1 = teclado.nextInt();

        mensagem = "Digite outro numero: ";
        System.out.println(mensagem);
        numero2 = teclado.nextInt();

        mensagem = "Digite outro numero: ";
        System.out.println(mensagem);
        numero3 = teclado.nextInt();

        if (numero1 > numero2 && numero1 > numero3) {
            mensagem = "Numero 1: " + numero1 + " é maior que " + numero2 + "," + numero3;
            System.out.println(mensagem);
        } else if (numero2 > numero1 && numero2 > numero3) {
            mensagem = "Numero 2: " + numero2 + " é maior que " + numero1 + "," + numero3;
            System.out.println(mensagem);
        } else if (numero3 > numero1 && numero3 > numero2) {
            mensagem = "Numero 3: " + numero3 + " é maior que " + numero2 + "," + numero1;
            System.out.println(mensagem);
        }
    }
}
