package projeto_final_lab_c206;

import java.io.*;
import java.util.ArrayList;

public class GerenciarLivro {
    
    private final ArrayList<Livro> livros = new ArrayList<>();
    private static final String NOME_ARQUIVO = "livros_cadastrados.txt";

    public GerenciarLivro() {
        carregarDados();
    }

    public void addLivro(Livro livro) {
        livros.add(livro);
        salvarDados();
    }

    public Livro procurarPorID(String ID) {
        for (Livro livro : livros) {
            if (livro.getID().equalsIgnoreCase(ID)) {
                return livro;
            }
        }
        return null;
    }

    public boolean atualizarLivro(String ID, String novoNome, String novoAutor, String novaCategoria) {
        Livro livro = procurarPorID(ID);
        if (livro != null) {
            livro.setNome(novoNome);
            livro.setAutor(novoAutor);
            if (livro instanceof Categoria) {
                ((Categoria) livro).setCategoria(novaCategoria);
            }
            salvarDados();
            return true;
        }
        return false;
    }

    public boolean deleteLivro(String ID) {
        Livro livro = procurarPorID(ID);
        if (livro != null) {
            livros.remove(livro);
            salvarDados();
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

    private void salvarDados() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(NOME_ARQUIVO))) {
            for (Livro livro : livros) {
                if (livro instanceof Categoria) {
                    Categoria categoria = (Categoria) livro;
                    writer.write("ID: " + categoria.getID() + ", Nome do  livro: " + categoria.getNome() + ", Nome do Autor: " + categoria.getAutor() + ", Categoria: " + categoria.getCategoria());
                } else {
                    writer.write(livro.getID() + "," + livro.getNome() + "," + livro.getAutor());
                }
                writer.newLine();
            }
            System.out.println("Dados salvos com sucesso.");
        } catch (IOException e) {
            System.out.println("Erro ao salvar os dados no arquivo: " + e.getMessage());
        }
    }

    private void carregarDados() {
        try (BufferedReader reader = new BufferedReader(new FileReader(NOME_ARQUIVO))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                String[] dados = linha.split(",");
                if (dados.length == 4) {
                    Categoria categoria = new Categoria(dados[0], dados[1], dados[2], dados[3]);
                    livros.add(categoria);
                } else if (dados.length == 3) {
                    Livro livro = new Livro(dados[0], dados[1], dados[2]);
                    livros.add(livro);
                }
            }
            System.out.println("Dados carregados com sucesso.");
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo de dados não encontrado. Um novo arquivo será criado.");
        } catch (IOException e) {
            System.out.println("Erro ao carregar os dados do arquivo: " + e.getMessage());
        }
    }
}
