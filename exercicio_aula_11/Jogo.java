package exercicio_aula_11;
public class Jogo {

    private int id;
    private String nome;
    private String genero;

    public Jogo(int id, String nome, String genero) {
        this.id = id;
        this.nome = nome;
        this.genero = genero;
    }       

    public void mostrarInfos() {
        System.out.println("ID: " + id);
        System.out.println("Nome: " + nome);
        System.out.println("Gênero: " + genero);
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getGenero() {
        return genero;
    }
}