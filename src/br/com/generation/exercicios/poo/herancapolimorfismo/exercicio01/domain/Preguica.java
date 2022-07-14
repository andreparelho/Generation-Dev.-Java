package br.com.generation.exercicios.poo.herancapolimorfismo.exercicio01.domain;

public class Preguica extends Animal{
    @Override
    public void somAnimal() {
        System.out.println("Som estranho da preguiça ....");
    }
    public void deveSubir(){
        System.out.println("Preguiça subindo arvore");
    }
}
