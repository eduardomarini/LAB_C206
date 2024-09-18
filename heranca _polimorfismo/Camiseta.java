package heranca _polimorfismo;

public class Camiseta {

    private String cor;
    private String tamanho;

    public Camiseta(String nome, double preco, String cor, String tamanho) {
        super(nome, preco);
        this.cor = cor;
        this.tamanho = tamanho;
    }

    public String etiquetaPreço() {
        return "Camiseta[cor=" + cor + ", tamanho=" + tamanho + "]";

    }

    // getters e setters

    public String getCor() {
        return cor;
    }

    public String getTamanho() {
        return tamanho;
    }
    
}
