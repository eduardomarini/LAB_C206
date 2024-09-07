package ex_banda;

public class Main {
    public static void main(String[] args) {
        Banda banda1 = new Banda();
        Banda banda2 = new Banda();

        banda1.setNome("Deep Purple");
        banda1.setNumeroDeIntegrantes(5);
        
        Musica deepPurple_1 = new Musica("Smoke on the Water", "Machine Head");
        Musica deepPurple_2 = new Musica("Highway Star", "Machine Head");
        Musica deepPurple_3 = new Musica("Perfect Strangers", "Perfect Strangers");

        banda1.adicionarMusica(deepPurple_1);
        banda1.adicionarMusica(deepPurple_2);
        banda1.adicionarMusica(deepPurple_3);

        banda2.setNome("Angra");
        banda2.setNumeroDeIntegrantes(6);

        Musica angra_1 = new Musica("Carry On", "Angels Cry");
        Musica angra_2 = new Musica("Nova Era", "Rebirth");
        Musica angra_3 = new Musica("Rebirth", "Rebirth");

        banda2.adicionarMusica(angra_1);
        banda2.adicionarMusica(angra_2);
        banda2.adicionarMusica(angra_3);

        // banda1.tocarMusica(2);
        // banda1.tocarMusica(0);
        // banda1.tocarMusica(1);

        // banda2.tocarMusica(1);
        // banda2.tocarMusica(0);
        // banda2.tocarMusica(2);

        // banda2.tocarMusica(3);

        banda1.tocarShow();
        banda2.tocarShow();

        banda1.deletarMusica("Smoke on the Water");
        banda2.deletarMusica("Carry On");

        banda1.tocarShow();
        banda2.tocarShow();
        







    

    }
    
}
