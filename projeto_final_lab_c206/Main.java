package projeto_final_lab_c206;

public class Main {
    
    public static void main(String[] args) {
        GerenciarItem gerenciarItem = new GerenciarItem();
        
        Item item1 = new Item("1", "Item 1", "Descrição do item 1");
        Item item2 = new Item("2", "Item 2", "Descrição do item 2");
        Item item3 = new Item("3", "Item 3", "Descrição do item 3");
        
        gerenciarItem.addItem(item1);
        gerenciarItem.addItem(item2);
        gerenciarItem.addItem(item3);
        
        gerenciarItem.listarItems();
        
        System.out.println("Procurando item com ID 2:");
        System.out.println(gerenciarItem.procurarPorID("2"));
        
        System.out.println("Atualizando item com ID 2:");
        gerenciarItem.atualizarItem("2", "Item 2 Atualizado", "Descrição do item 2 atualizado");
        System.out.println(gerenciarItem.procurarPorID("2"));
        
        System.out.println("Deletando item com ID 2:");
        gerenciarItem.deleteItem("2");
        gerenciarItem.listarItems();

    }
}

    

