package br.com.generation.exercicios.poo.herancapolimorfismo.exercicio01.domain;

public class Cachorro extends Animal {
    @Override
    public void somAnimal() {
        System.out.println("Au au au .....");
    }
    public void deveCorrer() {
        System.out.println("Cachorro correndo");
    }
}
