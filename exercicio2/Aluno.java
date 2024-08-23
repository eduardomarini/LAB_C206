package exercicio2;

import java.util.Scanner;

public class Aluno {

    int matricula, periodo;
    float np1, np2, np3;
    String nome;

    public float calculaMedia() {
        float media = (np1 + np2) / 2;
        if(media < 30) {
            System.out.println("O aluno(a) " + nome + " está reprovado(a), sua média foi: " + media);
        } 
        else if(media >= 30 && media < 60) {
            Scanner entrada = new Scanner(System.in);
            System.out.println("Aluno esta de recuperação, sua média foi de " + media + " digite a nota da NP3: ");
            np3 = entrada.nextFloat();
            float novaMedia = calculaNP3(media);
                if(novaMedia >= 50) {
                    System.out.println("O aluno(a) " + nome + " está aprovado(a), sua média foi: " + novaMedia);
                } else {
                    System.out.println("O aluno(a) " + nome + " está reprovado(a), sua média foi: " + novaMedia);
                }
        } else {
            System.out.println("O aluno(a) " + nome + " está aprovado(a), sua média foi: " + media);
        }
        return media;
    }

    public float calculaNP3(float media) {
        float notaTotal = media + np3;
        float novaMedia = notaTotal / 2;
        return novaMedia;
    }
    
    public String toString() {
        return "Nome: " + nome + "\n" +
               "Matrícula: " + matricula + "\n" +
               "Período: " + periodo + "\n" +
               "NP1: " + np1 + "\n" +
               "NP2: " + np2 + "\n" +
               "NP3: " + np3;
    }
}
