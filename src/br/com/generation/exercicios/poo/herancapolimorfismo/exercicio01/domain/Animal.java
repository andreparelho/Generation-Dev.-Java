package br.com.generation.exercicios.poo.herancapolimorfismo.exercicio01.domain;

public abstract class Animal implements AnimalInterface {
    String nome;
    int idade;

    @Override
    public void somAnimal() {
        System.out.println("Som do Animal");
    }
}
