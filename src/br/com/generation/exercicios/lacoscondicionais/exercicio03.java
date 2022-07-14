package br.com.generation.lacoscondicionais;

import java.util.Scanner;

public class exercicio03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int idade;
        String mensagem;

        mensagem = "Digite sua idade: ";
        System.out.println(mensagem);
        idade = teclado.nextInt();

        if (idade >= 10 && idade <= 14) {
            mensagem = "INFANTIL";
            System.out.println(mensagem);
        } else if (idade >= 15 && idade <= 17) {
            mensagem = "JUVENIL";
            System.out.println(mensagem);
        } else if (idade >= 18 && idade <= 25){
            mensagem = "ADULTO";
            System.out.println(mensagem);
         } else {
            mensagem = "IDADE INCORRETA";
            System.out.println(mensagem);
        }

    }
}
