package PV2;

abstract class Item implements AplicarDesconto {
    private String nome;
    private double preco;
    private int estoque;

    public Item(String nome, double preco, int estoque) {
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
    }

    public boolean verificarEstoque(int quantidade) {
        return quantidade <= estoque;
    }

    public abstract void mostrarInfo();

    @Override
    public double aplicarDesconto(double porcentagem) {
        if (porcentagem > 0 && porcentagem < 1) {
            this.preco -= this.preco * porcentagem;
        }
        return this.preco;
    }

     // Getter para estoque
     public int getEstoque() {
        return estoque;
    }

    // Setter para estoque
    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

     // Getter para nome
     public String getNome() {
        return nome;
    }

     // Getter para preco
     public double getPreco() {
        return preco;
    }
}