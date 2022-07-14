package br.com.generation.lacoscondicionais;

import java.util.Scanner;

public class exercicio04 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double numero, raiz;
        String mensagem;

        mensagem = "Digite um numero: ";
        System.out.println(mensagem);
        numero = teclado.nextDouble();

        if (numero % 2 == 0) {
            raiz = Math.sqrt(numero);
            mensagem = "NUMERO PAR" + "\nRAIZ QUADRADA = " + (int)raiz;
            System.out.println(mensagem);

        } else {
            raiz = numero * numero;
            mensagem = "NUMERO IMPAR" + "\nELEVADO AO QUADRADO = " + (int)raiz;
            System.out.println(mensagem);

        }
    }
}
