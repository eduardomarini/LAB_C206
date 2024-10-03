package abstrats_interface;

public class Corredor extends Atleta implements Equipamento.colocarEquipamento {

    @Override
    public void treinar() {
        System.out.println("Corredor treinando...");
    }

    @Override
    public void colocarEquipamento() {
        System.out.println("Corredor colocando tênis...");
    }
    
}
