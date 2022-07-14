package br.com.generation.exercicios.poo.herancapolimorfismo.exercicio01.domain;

public class Cavalo extends Animal {
    @Override
    public void somAnimal() {
        System.out.println("Ihi hi hi hi ....");
    }
    public void deveCorrer(){
        System.out.println("Cavalo correndo...");
    }
}
