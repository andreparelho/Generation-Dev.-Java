package br.com.generation.lacoscondicionais;

import java.util.Scanner;

public class exercicio02 {
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

        if (numero1 < numero2) {
            if (numero2 < numero3) {
                mensagem = numero1 + "\n" + numero2 + "\n" + numero3;
                System.out.println(mensagem);
            } else if (numero1 < numero3) {
                mensagem = numero1 + "\n" + numero3 + "\n" + numero2;
                System.out.println(mensagem);
            } else {
                mensagem = numero3 + "\n" + numero1 + "\n" + numero2;
                System.out.println(mensagem);
            }
        } else if (numero2 < numero3) {
            if (numero1 < numero3) {
                mensagem = numero2 + "\n" + numero1 + "\n" + numero3;
                System.out.println(mensagem);
            } else {
                mensagem = numero2 + "\n" + numero3 + "\n" + numero1;
                System.out.println(mensagem);
            }
        } else {
            mensagem = numero3 + "\n" + numero2 + "\n" + numero1;
            System.out.println(mensagem);
        }

    }
}
