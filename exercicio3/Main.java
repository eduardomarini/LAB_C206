package exercicio3;

public class Main {

    public static void main(String[] args) {
        Arma arma = new Arma();
        Arma arma2 = new Arma();
        Jogador jogador = new Jogador();
        Jogador jogador2 = new Jogador();

        arma.dano = 10;
        arma.custoDeEnergia = 15;
        arma2.dano = 20;
        arma2.custoDeEnergia = 25;

        jogador.arma = arma;
        jogador.vida = 100;
        jogador.energia = 100;
        jogador2.arma = arma2;
        jogador2.vida = 80;
        jogador2.energia = 80;

        
        jogador.atacar(jogador2);
        System.out.println(jogador2);

        jogador2.atacar(jogador);
        System.out.println(jogador);
        

    }
}
