package exercicio3;

public class Arma {
    int dano;
    int custoDeEnergia;

    public void arma(int dano, int custoDeEnergia) {
        this.dano = dano;
        this.custoDeEnergia = custoDeEnergia;
    }

    public String toString() {
        return "Arma[dano=" + dano + ", custoDeEnergia=" + custoDeEnergia + "]";
    }
}

