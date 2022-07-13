package br.com.generation.exercicios.poo.classesemetodos.exercicio02.domain;

public class Aviao {
    private String aviaoCod;
    private String idPassageiro;
    private String compAerea;
    private static String destino;

    public String getAviaoCod() {
        return aviaoCod;
    }

    public void setAviaoCod(String aviaoCod) {
        this.aviaoCod = aviaoCod;
    }

    public String getIdPassageiro() {
        return idPassageiro;
    }

    public void setIdPassageiro(String idPassageiro) {
        this.idPassageiro = idPassageiro;
    }

    public String getCompAerea() {
        return compAerea;
    }

    public void setCompAerea(String compAerea) {
        this.compAerea = compAerea;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public static void voando () throws InterruptedException {
        String voo = ".", mensagem;

        for (int i = 0; i < 10; i++) {
            System.out.println(voo);
            Thread.sleep(500);
        }
        mensagem = "Destino final ..... " + destino;
        System.out.println(mensagem);
    }
}
