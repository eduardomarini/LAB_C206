package heranca_polimorfismo;

public class Camiseta extends Produto {

    private String cor;
    private String tamanho;

    public Camiseta(String nome, double preco, String cor, String tamanho) {
        super(nome, preco);
        this.cor = cor;
        this.tamanho = tamanho;
    }

    @Override
    public String etiquetaPreco() {
        return "cor=" + cor + ", tamanho=" + tamanho;

    }

    // getters e setters

    public String getCor() {
        return cor;
    }

    public String getTamanho() {
        return tamanho;
    }
    
}
