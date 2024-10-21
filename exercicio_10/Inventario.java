package exercicio_10;

import java.util.ArrayList;

public class Inventario {

    private ArrayList<Livro> livros;

    public Inventario() {
        this.livros = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro) throws ExcecaoLivroInvalido {
        if(livro.getTitulo().isEmpty()) {
            throw new ExcecaoLivroInvalido("Título do livro não pode ser vazio");
        }
        if(livro.getPreco() < 0) {
            throw new ExcecaoLivroInvalido("Preço do livro não pode ser negativo");
        }
        livros.add(livro);
    }

    public ArrayList<Livro> getLivros() {
        return this.livros;
    }

    public void exibirLivros() {
        for (Livro livro : this.livros) {
            System.out.println(livro);
        }
    }
}
