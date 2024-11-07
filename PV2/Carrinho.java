package PV2;

import java.util.ArrayList;

class Carrinho {
    private ArrayList<Item> carrinhoArray = new ArrayList<>();

    public boolean adicionarItem(Item item, int quantidade) throws EstoqueInsuficienteException {
        if (item.verificarEstoque(quantidade)) {
            carrinhoArray.add(item);
            item.setEstoque(item.getEstoque() - quantidade);
            System.out.println("Item adicionado ao carrinho: " + item.getNome() + ", Quantidade: " + quantidade);
            return true;
        } else {
            throw new EstoqueInsuficienteException("Estoque insuficiente para o item: " + item.getNome());
        }
    }

    public double calcularTotal() throws CarrinhoVazioException {
        if (carrinhoArray.isEmpty()) {
            throw new CarrinhoVazioException("O carrinho está vazio.");
        }
        double total = 0;
        for (Item item : carrinhoArray) {
            total += item.getPreco();
        }
        return total;
    }

    public void exibirItens() {
        System.out.println("Itens no carrinho:");
        for (Item item : carrinhoArray) {
            item.mostrarInfo();
        }
    }
}

