package projeto_final_lab_c206;

import java.util.ArrayList;

public class GerenciarItem {
    
    private final ArrayList<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);
    }

    public Item procurarPorID(String ID) {
        for (Item item : items) {
            if (item.getId().equalsIgnoreCase(id)) {
                return item;
            }
        }
        return null;
    }

    public boolean atualizarItem(String ID, String novoName, String novaDescricao) {
        Item item = procurarPorID(id);
        if (item != null) {
            item.setNome(novoName);
            item.setDescricao(novaDescricao);
            return true;
        }
        return false;
    }

    public boolean deleteItem(String ID) {
        Item item = procurarPorID(id);
        if (item != null) {
            items.remove(item);
            return true;
        }
        return false;
    }

    public void listarItems() {
        if (items.isEmpty()) {
            System.out.println("Não foi encontrado nenhum item.");
        } else {
            for (Item item : items) {
                System.out.println(item);
            }
        }
    }
    
}
