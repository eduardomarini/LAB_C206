package projeto_final_lab_c206;

public class Livro {

    private String ID;
    private String nome;
    private String autor;

    public Livro(String ID, String nome, String autor) {
        this.ID = ID;
        this.nome = nome;
        this.autor = autor;
    }

    public String getID() {
        return ID;
    }

    public String getNome() {
        return nome;
    }

    public String getAutor() {
        return autor;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "ID: " + ID + ", Nome: " + nome + ", Autor: " + autor;
    }
}
