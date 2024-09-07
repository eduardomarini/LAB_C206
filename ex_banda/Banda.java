package ex_banda;

public class Banda {

    private String nome;
    private int numeroDeIntegrantes;
    private Musica[] musicas;
   
    public Banda() {
        this.musicas = new Musica[3];
    }

    public Banda(String nome, int numeroDeIntegrantes, int numeroDeMusicas) {
        this.nome = nome;
        this.numeroDeIntegrantes = numeroDeIntegrantes;
        this.musicas = new Musica[numeroDeMusicas];
    }

    public void tocarMusica(int posicao) {
      if (posicao < 0 || posicao >= musicas.length || musicas[posicao] == null) {
        System.out.println("Música não encontrada");
        return;
      }
        System.out.println("Tocando " + musicas[posicao].getNome() + " do álbum " + musicas[posicao].getAlbum());
    }

    public void tocarShow() {
        for (int i = 0; i < musicas.length; i++) {
            tocarMusica(i);
        }
    }

    public boolean adicionarMusica(Musica musica) {
        for (int i = 0; i < musicas.length; i++) {
            if (musicas[i] == null) {
                musicas[i] = musica;
                return true;
            }
        }
        return false;
    }

    public boolean deletarMusica(String nome) {
        for (int i = 0; i < musicas.length; i++) {
            if (musicas[i].getNome().equals(nome)) {
                musicas[i] = null;
                return true;
            }
        }
        return false;
    }



    // Getters e Setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumeroDeIntegrantes() {
        return numeroDeIntegrantes;
    }

    public void setNumeroDeIntegrantes(int numeroDeIntegrantes) {
        this.numeroDeIntegrantes = numeroDeIntegrantes;
    }


    public Musica[] getMusicas() {
        return musicas;
    }

    public void setMusicas(Musica[] musicas) {
        this.musicas = musicas;
    }
   
}
