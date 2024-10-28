package exercicio_aula_11;
import java.io.*;

import exercicio_aula_11.Jogo;

public class Arquivo {

    private Jogo jogo;

    public void lerJogos() {
        InputStream fluxoEntrada = null; // Lê o fluxo de bytes de um arquivo
        InputStreamReader geradorFluxoEntrada = null; // Transforma os bytes em caracteres
        BufferedReader bufferEntrada = null; // Buffer de leitura

        try {
            fluxoEntrada = new FileInputStream("jogos.txt");
            geradorFluxoEntrada = new InputStreamReader(fluxoEntrada);
            bufferEntrada = new BufferedReader(geradorFluxoEntrada);

            String leitura = bufferEntrada.readLine();
            while (leitura != null) {
                System.out.println(leitura);
                leitura = bufferEntrada.readLine();
            }
        }catch (Exception e) {
            System.err.printf(String.valueOf(e));
        }finally {
            try {
                assert bufferEntrada != null;
                bufferEntrada.close();
                System.out.println("Arquivo fechado com sucesso");
            }catch (IOException e) {
                System.err.printf(String.valueOf(e));
            }
        }
    }

    public void lerJogo(String preco) {
        // criando os objetos de leitura
        FileInputStream fluxoEntrada = null; // Lê o fluxo de bytes de um arquivo
        InputStreamReader geradorFluxoEntrada = null; // Transforma os bytes em caracteres
        BufferedReader bufferEntrada = null; // Buffer de leitura

        try {
            // inicializando os objetos de leitura
            fluxoEntrada = new FileInputStream("jogos.txt");
            geradorFluxoEntrada = new InputStreamReader(fluxoEntrada);
            bufferEntrada = new BufferedReader(geradorFluxoEntrada);
            // Leitura do arquivo
            String leitura = bufferEntrada.readLine();
            while (leitura != null) {
                if (leitura.contains("Preço = " + preco)) {
                    System.out.println(leitura);
                }
                leitura = bufferEntrada.readLine();
            }
        }catch (Exception e) {
            System.err.printf(String.valueOf(e));
        }finally {
            // fechando o arquivo
            try {
                assert bufferEntrada != null;
                bufferEntrada.close();
            }catch (IOException e) {
                System.err.printf(String.valueOf(e));
            }
        }
    }

    public void escrever(Jogo jogo) {

        FileOutputStream fluxoSaida = null;
        OutputStreamWriter geradorFluxoSaida = null;
        BufferedWriter bufferSaida = null;
        try {
            fluxoSaida = new FileOutputStream("jogos.txt", true); // true -> permite a adição de conteúdo sem sobrescrever o arquivo
            geradorFluxoSaida = new OutputStreamWriter(fluxoSaida);
            bufferSaida = new BufferedWriter(geradorFluxoSaida);

            bufferSaida.write("ID: " + jogo.getId() + ", Nome: " + jogo.getNome() + ", Gênero: " + jogo.getGenero());
        }catch (Exception e){
            System.err.printf(String.valueOf(e));
        } finally {
            try {
                // Fechando o buffer
                assert bufferSaida != null;
                bufferSaida.close();
            } catch (IOException e) {
                System.err.printf(String.valueOf(e));
            }
        }
    }
}