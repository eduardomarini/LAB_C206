package aula_9;

import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        //crie um objeto do tipo Estoque e 5 itens
        Estoque estoque = new Estoque();
        Item item1 = new Item("item1", 1);
        Item item2 = new Item("item2", 2);
        Item item3 = new Item("item3", 3);
        Item item4 = new Item("item4", 4);
        Item item5 = new Item("item5", 5);

        //adicionando os itens ao estoque
        estoque.adicionarArray(item1);
        estoque.adicionarArray(item2);
        estoque.adicionarArray(item3);
        estoque.adicionarArray(item4);
        estoque.adicionarArray(item5);

        //buscando um item na posição 2
        estoque.buscar(2);
        
        //deletando um item na posição 3
        estoque.deletar(3);

        //deletando um item específico
        estoque.deletar(item2);

        //modificando um item na posição 1
        Item item6 = new Item("item6", 6);
        estoque.modificar(item6, 1);

        Collections.sort(estoque.getItens());
        System.out.println(estoque);
    }
}
