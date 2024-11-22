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

    private void salvarDados() {
        // Implementar a lógica para salvar os livros no arquivo
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(NOME_ARQUIVO))) {
            for (Livro livro : livros) {
                writer.write("ID: " + livro.getID() + ", " +"Nome do livro: " + livro.getNome() + ", " + "Nome do Autor: " + livro.getAutor());
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Erro ao salvar os dados no arquivo." + e.getMessage());
        }
    }

    private void carregarDados() {
        // Implementar a lógica para carregar os livros do arquivo
        try (BufferedReader reader = new BufferedReader(new FileReader(NOME_ARQUIVO))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                String[] dados = linha.split(",");
                if (dados.length != 3) {
                    Livro livro = new Livro(dados[0], dados[1], dados[2]);
                    livros.add(livro);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Erro ao carregar os dados do arquivo." + e.getMessage());
        } catch (IOException e) {
            System.out.println("Erro ao fechar o arquivo." + e.getMessage());
        }
    }
}
