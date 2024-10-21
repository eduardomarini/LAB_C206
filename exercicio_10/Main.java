package exercicio_10;

public class Main {
    public static void main(String[] args) {
        Inventario inventario = new Inventario();

        // Primeiro try-catch
        try {
            Livro livroValido1 = new Livro("Livro 1", "João da Silva", 50.0);
            Livro livroInvalido1 = new Livro("", "Silva da Silva", 50.0); // Título vazio
            inventario.adicionarLivro(livroValido1);
            inventario.adicionarLivro(livroInvalido1);
        } catch (ExcecaoLivroInvalido e) {
            System.out.println("Erro ao adicionar livro: " + e.getMessage());
        }

        // Segundo try-catch
        try {
            Livro livroValido2 = new Livro("Livro 2", "Maria do Carmo", 30.0);
            Livro livroInvalido2 = new Livro("Livro 3", "João", -10.0); // Preço menor que zero
            inventario.adicionarLivro(livroValido2);
            inventario.adicionarLivro(livroInvalido2);
        } catch (ExcecaoLivroInvalido e) {
            System.out.println("Erro ao adicionar livro: " + e.getMessage());
        }

        // Exibir livros no inventário
        inventario.exibirLivros();
    }
}