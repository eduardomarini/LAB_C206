package heranca_polimorfismo;

public class Produto {

    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String etiquetaPreco() {
        return "nome=" + nome + ", preco=" + preco;
    }

    // getters e setters

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }
    
}
