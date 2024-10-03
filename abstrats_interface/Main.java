package abstrats_interface;

public class Main {
    public static void main(String[] args) {
        
        Nadador nadador = new Nadador();
        Corredor corredor = new Corredor();
        Ciclista ciclista = new Ciclista();

        nadador.treinar();
        corredor.treinar();
        ciclista.treinar();

        corredor.colocarEquipamento();
        ciclista.colocarEquipamento();
        
    }
    
}
