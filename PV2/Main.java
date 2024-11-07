package PV2;

public class Main {
    public static void main(String[] args) {
        
        Carrinho carrinho = new Carrinho();
        
        Alimento arroz = new Alimento("Arroz", 10.0, 20, "10/12/2024");
        Vestuario camiseta = new Vestuario("Camiseta", 50.0, 5, 42);
        Alimento feijao = new Alimento("Feijão", 15.0, 0, "15/12/2024"); // Estoque 0 para forçar erro
        Vestuario calca = new Vestuario("Calça", 80.0, 3, 40);

        // Aplicando desconto em um item
        camiseta.aplicarDesconto(0.2); // 20% de desconto

        try {
            carrinho.adicionarItem(arroz, 2);
            carrinho.adicionarItem(camiseta, 1);
            System.out.println("Itens adicionados ao carrinho com sucesso.");
        } catch (EstoqueInsuficienteException e) {
            System.out.println(e.getMessage());
        }

        try {
            carrinho.adicionarItem(feijao, 1); // Estoque insuficiente
        } catch (EstoqueInsuficienteException e) {
            System.out.println(e.getMessage());
        }

        try {
            double total = carrinho.calcularTotal();
            System.out.println("Total do carrinho: " + total);
        } catch (CarrinhoVazioException e) {
            System.out.println(e.getMessage());
        }

        Carrinho carrinhoVazio = new Carrinho(); // Carrinho vazio para forçar a exceção
        try {
            double totalVazio = carrinhoVazio.calcularTotal();
            System.out.println("Cenário 4: Total do carrinho vazio: " + totalVazio);
        } catch (CarrinhoVazioException e) {
            System.out.println(e.getMessage());
        }

        carrinho.exibirItens();
    }
}

