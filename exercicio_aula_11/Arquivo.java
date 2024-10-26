import java.io.*;

public class Arquivo {

    public void lerJogos() {
        InputStream fluxoEntrada = null; // Lê o fluxo de bytes de um arquivo
        InputStreamReader geradorFluxoEntrada = null; // Transforma os bytes em caracteres
        BufferedReader bufferEntrada = null; // Buffer de leitura

        try {
            fluxoEntrada = newFileInputStream("jogos.txt");
            geradorFluxoEntrada = new InputStreamReader(fluxoEntrada);
            bufferEntrada = new BufferedReader(geradorFluxoEntrada);

            String leitura = bufferEntrada.read.Line();
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
        FileInputStream fluxo Entrada = null; // Lê o fluxo de bytes de um arquivo
        InputStreamReader geradorFluxoEntrada = null; // Transforma os bytes em caracteres
        BufferReader bufferEntrada = null; // Buffer de leitura

        try {
            // inicializando os objetos de leitura
            fluxoEntrada = new FileInputStream("jogos.txt");
            geradorFluxoEntrada = new InputStreamReader(fluxoEntrada);
            bufferEntrada = new BufferedReader(geradorFluxoEntrada);
            // Leitura do arquivo
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

    public void escrever() {

        FileOutputStream fluxoSaida = null;
        OutputStreamWriter geradorFluxoSida = null;
        BufferedWriter bufferSaida = null;
        try {
            fluxoSaida = new FileOutputStream("jogos.txt");
            geradorFluxoSaida = new OutputStreamWriter(fluxoSaida);
            bufferSaida = new BufferedWriter(geradorFluxoSaida);

            bufferSaida.write()
        }

    }




}