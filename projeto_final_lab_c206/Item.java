package projeto_final_lab_c206;

public class Item {

    private String ID;
    private String nome;
    private String descricao;

    public Item(String ID, String nome, String descricao) {
        this.ID = ID;
        this.nome = nome;
        this.descricao = descricao;
    }

    public String getID() {
        return ID;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setNome(String name) {
        this.name = nome;
    }

    public void setDescricao(String description) {
        this.description = descicao;
    }

    @Override
    public String toString() {
        return "ID: " + ID + ", Nome: " + nome + ", Descrição: " + descricao;
    }
    
}