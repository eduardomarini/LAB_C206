package PV2;

class Vestuario extends Item {
    private int tamanho;

    public Vestuario(String nome, double preco, int estoque, int tamanho) {
        super(nome, preco, estoque);
        this.tamanho = tamanho;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Vestuário: " + getNome() + ", Preço: " + getPreco() + ", Estoque: " + getEstoque() + ", Tamanho: " + tamanho);
    }
}