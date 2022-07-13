package br.com.generation.exercicios.poo.classesemetodos.exercicio01.domain;

public class Cliente {

    private String nome;
    private int idade;
    private String telefone;
    private String cartaoBandeira;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCartaoBandeira() {
        return cartaoBandeira;
    }

    public void setCartaoBandeira(String cartaoBandeira) {
        this.cartaoBandeira = cartaoBandeira;
    }
    public static void pagamento() throws InterruptedException {
        String pagamentoCliente = "Efetuando pagamento";
        String aguarde = ".";

        System.out.print(pagamentoCliente);

        for (int i = 0; i < 15; i++) {
            System.out.print(aguarde);
            Thread.sleep(500);
        }
    }
    public static void compras() {
        String compraSucess = "Pagamento efetuado com sucesso.";
        System.out.println(compraSucess);
    }
}
