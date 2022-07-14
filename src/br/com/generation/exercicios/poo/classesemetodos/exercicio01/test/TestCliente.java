package br.com.generation.exercicios.poo.classesemetodos.exercicio01.test;

import br.com.generation.exercicios.poo.classesemetodos.exercicio01.domain.Cliente;

public class TestCliente {
    public static void main(String[] args) throws InterruptedException {
        Cliente cliente01 = new Cliente();

        cliente01.setNome("André Parelho");
        cliente01.setIdade(26);
        cliente01.setTelefone("55 11 9999-9999");
        cliente01.setCartaoBandeira("Amex");

        System.out.println("Nome: " + cliente01.getNome() + "\n" + "Idade: "+ cliente01.getIdade() + "\n" + "Tel: " +
                cliente01.getTelefone() + "\n" + "Bandeira: " + cliente01.getCartaoBandeira());

        cliente01.pagamento();
        cliente01.compras();
    }
}
