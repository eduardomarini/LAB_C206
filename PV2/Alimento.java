package PV2;

class Alimento extends Item {
    private String validade;

    public Alimento(String nome, double preco, int estoque, String validade) {
        super(nome, preco, estoque);
        this.validade = validade;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Alimento: " + getNome() + ", Preço: " + getPreco() + ", Estoque: " + getEstoque() + ", Validade: " + validade);
    }
}