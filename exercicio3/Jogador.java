package exercicio3;

public class Jogador {

    int energia, vida;
    Arma arma;

    public void atacar(Jogador alvo) {
        if (energia >= arma.custoDeEnergia) {
            alvo.vida -= arma.dano;
            energia -= arma.custoDeEnergia;
            System.out.println("O jogador atacou o alvo, o alvo perdeu " + arma.dano + " de vida");
        } else {
            System.out.println("Ataque falhou");
        }
    }

    public void jogador() {
        vida = 100;
        energia = 100;
    }

    public void jogador(Arma arma, int energi, int vida) {
        this.arma = arma;
        this.energia = energia;
        this.vida = vida;
    }

    public String toString() {

        String armaInfo;

        if(arma != null) {
            armaInfo = arma.toString();
        } else {
            armaInfo = "Sem arma";
        }

        return "Vida: " + vida + "\n" +
               "Energia: " + energia + "\n" +
               "Arma: " + armaInfo;
    }
}
