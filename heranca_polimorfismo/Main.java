package heranca_polimorfismo;

public class Main {
    public static void main(String[] args) {

        //criação array de produtos
        Produto[] produtos = new Produto[3];


        //criação de objetos
        produtos[0] = new Notebook("Notebook Gamer", 5000.00, 512, "NVIDIA GTX 1650", "Intel i7");
        produtos[1] = new Camiseta("Camiseta Esportiva", 100.00, "Azul", "G");
        produtos[2] = new Produto("Mesa", 300.00);

        //Iteração pelo array de produtos
        for (int i = 0; i < produtos.length; i++) {
            Produto produto = produtos[i];
            if(produto instanceof Notebook) {
                System.out.println("Notebook: " + produto.etiquetaPreco());
            } else if(produto instanceof Camiseta) {
                System.out.println("Camiseta: " + produto.etiquetaPreco());
            } else {
                System.out.println("Produto: " + produto.etiquetaPreco());
            }
        } 
    }  
}
