package br.com.generation.exercicios.lacosderepeticao;

import java.util.Scanner;

public class exercicio06 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int numero, contadorMedia = 0, valor = 0;
        double media = 0;
        String mensagem, msgContador = "";

        do {
            mensagem = "Digite um numero : ";
            System.out.println(mensagem);
            numero = teclado.nextInt();
            if (numero % 3 == 0 && numero != 0) {
                contadorMedia++;
                valor += numero;
                msgContador = "Numeros Multiplos de 3: " + contadorMedia;
                media = (double) valor / contadorMedia;
            }
            System.out.println( "- - - - - - - - - - - " + "\n[DIGITE 0 PARA SAIR]" + "\n- - - - - - - - - - - ");
        } while (numero != 0); {
        }
        mensagem = "\nMedia dos Multiplos de 3: " + media;
        System.out.println(msgContador + mensagem);
    }
}
