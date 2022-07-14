package br.com.generation.exercicios.poo.classesemetodos.exercicio02.test;

import br.com.generation.exercicios.poo.classesemetodos.exercicio02.domain.Aviao;

import java.util.Scanner;

public class AviaoTest {
    public static void main(String[] args) throws InterruptedException {
        Aviao dadosPassageiro = new Aviao();
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o Código do Avião: ");
        dadosPassageiro.setAviaoCod(teclado.next());

        System.out.println("Digite a Companhia Aérea: ");
        dadosPassageiro.setCompAerea(teclado.next());

        System.out.println("Digite o seu ID: ");
        dadosPassageiro.setIdPassageiro(teclado.next());

        System.out.println("Digite o Destino do Voo: ");
        dadosPassageiro.setDestino(teclado.next());

        dadosPassageiro.voando();
    }
}
