package projeto_final_lab_c206;

public class Categoria extends Livro {
    private String categoria;

    public Categoria(String ID, String nome, String autor, String categoria) {
        super(ID, nome, autor);
        this.categoria = categoria;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return super.toString() + ", Digite a categoria do livro: " + categoria;
    }
    
}
