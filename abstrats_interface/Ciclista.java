package abstrats_interface;

public class Ciclista extends Atleta implements Equipamento.colocarEquipamento {

    @Override
    public void treinar() {
        System.out.println("Ciclista treinando...");
    }

    @Override
    public void colocarEquipamento() {
        System.out.println("Ciclista colocando capacete...");
    }
    
}
