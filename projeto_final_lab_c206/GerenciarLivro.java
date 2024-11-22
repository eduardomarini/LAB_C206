package projeto_final_lab_c206;

import java.util.ArrayList;

public class GerenciarLivro {
    
    private final ArrayList<Livro> livros = new ArrayList<>();

    public void addLivro(Livro livro) {
        livros.add(livro);
    }

    public Livro procurarPorID(String ID) {
        for (Livro livro : livros) {
            if (livro.getID().equalsIgnoreCase(ID)) {
                return livro;
            }
        }
        return null;
    }

    public boolean atualizarLivro(String ID, String novoNome, String novoAutor) {
        Livro livro = procurarPorID(ID);
        if (livro != null) {
            livro.setNome(novoNome);
            livro.setAutor(novoAutor);
            return true;
        }
        return false;
    }

    public boolean deleteLivro(String ID) {
        Livro livro = procurarPorID(ID);
        if (livro != null) {
            livros.remove(livro);
            return true;
        }
        return false;
    }

    public void listarLivros() {
        if (livros.isEmpty()) {
            System.out.println("Não foi encontrado nenhum livro.");
        } else {
            for (Livro livro : livros) {
                System.out.println(livro);
            }
        }
    }
}
