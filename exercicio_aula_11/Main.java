package exercicio_aula_11;

public class Main {
    public static void main(String[] args) {

        Jogo jogo1 = new Jogo(1, "The Witcher 3", "RPG");
        Jogo jogo2 = new Jogo(2, "GTA V", "Ação");
        Jogo jogo3 = new Jogo(3, "FIFA 21", "Esporte");

        Arquivo arquivo = new Arquivo();
        arquivo.escrever(jogo1);
        arquivo.escrever(jogo2);
        arquivo.escrever(jogo3);

        System.out.println("Lendo o jogo 1");
        arquivo.lerJogo("1");

        System.out.println("Lendo o jogo 2");
        arquivo.lerJogo("2");

        System.out.println("Lendo os jogos...");
        arquivo.lerJogos();

        jogo1.mostrarInfos();
        jogo2.mostrarInfos();
        jogo3.mostrarInfos();
    }
        

}