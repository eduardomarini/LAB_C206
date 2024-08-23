package exercicio2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();

        Scanner entrada = new Scanner(System.in);
        float np3;

        aluno.nome = "João";
        aluno.matricula = 209;
        aluno.periodo = 3;
        aluno.np1 = 40;
        aluno.np2 = 30;

        aluno.calculaMedia();

        System.out.println(aluno.toString());
    }
    
}
