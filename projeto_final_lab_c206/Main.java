package projeto_final_lab_c206;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        GerenciarLivro gerenciarLivro = new GerenciarLivro();
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Adicionar livro");
            System.out.println("2 - Buscar livro por ID");
            System.out.println("3 - Atualizar livro");
            System.out.println("4 - Excluir livro");
            System.out.println("5 - Listar livros");
            System.out.println("6 - Sair");
            System.out.println("Opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1: 
                    System.out.println("Digite o ID do livro: ");
                    String ID = scanner.nextLine();
                    System.out.println("Digite o nome do livro: ");
                    String nome = scanner.nextLine();
                    System.out.println("Digite o autor do livro: ");
                    String autor = scanner.nextLine();
                    Livro livro = new Livro(ID, nome, autor);
                    gerenciarLivro.addLivro(livro);
                    System.out.println("Livro adicionado com sucesso!");
                    break;
                case 2:
                    System.out.println("Digite o ID do livro a ser buscado: ");
                    ID = scanner.nextLine();
                    Livro livroEncontrado = gerenciarLivro.procurarPorID(ID);
                    if (livroEncontrado != null) {
                        System.out.println(livroEncontrado);
                    } else {
                        System.out.println("Livro não encontrado.");
                    }
                    break;
                case 3:
                    System.out.println("Digite o ID do livro a ser atualizado: ");
                    ID = scanner.nextLine();
                    System.out.println("Digite o novo nome do livro: ");
                    nome = scanner.nextLine();
                    System.out.println("Digite o novo autor do livro: ");
                    autor = scanner.nextLine();
                    boolean atualizado = gerenciarLivro.atualizarLivro(ID, nome, autor);
                    if (atualizado) {
                        System.out.println("Livro atualizado com sucesso!");
                    } else {
                        System.out.println("Livro não encontrado.");
                    }
                    break;
                case 4:
                    System.out.println("Digite o ID do livro a ser excluído: ");
                    ID = scanner.nextLine();
                    boolean deletado = gerenciarLivro.deleteLivro(ID);
                    if (deletado) {
                        System.out.println("Livro excluído com sucesso!");
                    } else {
                        System.out.println("Livro não encontrado.");
                    }
                    break;
                case 5:
                    gerenciarLivro.listarLivros();
                    break;
                case 6:
                    continuar = false;
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
    
            }
        }

        scanner.close();
    }
}


    

