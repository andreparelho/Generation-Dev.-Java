package br.com.generation.exercicios.poo.herancapolimorfismo.exercicio01.test;

import br.com.generation.exercicios.poo.herancapolimorfismo.exercicio01.domain.Cachorro;
import br.com.generation.exercicios.poo.herancapolimorfismo.exercicio01.domain.Cavalo;
import br.com.generation.exercicios.poo.herancapolimorfismo.exercicio01.domain.Preguica;

public class ImprimeAnimais {
    public static void main(String[] args) {
        TestAnimais anm = new TestAnimais();

        anm.emitindoSom(new Cachorro());
        anm.correndo(new Cachorro());

        anm.emitindoSom(new Cavalo());
        anm.correndo(new Cavalo());

        anm.emitindoSom(new Preguica());
        anm.subindo(new Preguica());
        
    }
}
