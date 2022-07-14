package br.com.generation.exercicios.poo.herancapolimorfismo.exercicio01.test;

import br.com.generation.exercicios.poo.herancapolimorfismo.exercicio01.domain.AnimalInterface;
import br.com.generation.exercicios.poo.herancapolimorfismo.exercicio01.domain.Cachorro;
import br.com.generation.exercicios.poo.herancapolimorfismo.exercicio01.domain.Cavalo;
import br.com.generation.exercicios.poo.herancapolimorfismo.exercicio01.domain.Preguica;

public class TestAnimais {
    public void emitindoSom (AnimalInterface animal) {
        animal.somAnimal();
    }
    public void correndo (Cachorro dog) {
        dog.deveCorrer();
    }
    public void correndo (Cavalo horse) {
        horse.deveCorrer();
    }

    public void subindo (Preguica preg) {
        preg.deveSubir();
    }

}
