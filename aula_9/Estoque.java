package aula_9;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Estoque {

    private ArrayList<Item> itensArray = new ArrayList<>();

    public void adicionarArray(Item item) {
        itensArray.add(item);
    }

    public void buscar(int posicao) {
        if(posicao >= 0 && posicao < itensArray.size()) {
            System.out.println(itensArray.get(posicao));
        } else {
            System.out.println("Posição inválida");
        }
    }
    

    public void deletar(int posicao) {
        if (posicao >= 0 && posicao < itensArray.size()) {
            itensArray.remove(posicao);
        } else {
            System.out.println("Posição inválida.");
        }
    }

    public void deletar(Item item) {
        if(itensArray.contains(item)) {
            itensArray.remove(item);
        } else {
            System.out.println("Item não encontrado.");
        }
    }

    public void modificar(Item item, int posicao) {
        if (posicao >= 0 && posicao < itensArray.size()) {
            itensArray.set(posicao, item);
        } else {
            System.out.println("Posição inválida.");
        }
    }

    public ArrayList<Item> getItensArray() {
        return itensArray;
    }
}
