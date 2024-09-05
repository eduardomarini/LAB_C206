package ex_calc;

public class Main {
    public static void main(String[] args) {
    
        double circunferencia = Calculadora.circunferencia(5);
        double volumeEsfera = Calculadora.volumeEsfera(5);
        double volumeCilindro = Calculadora.volumeCilindro(5, 10);

        System.out.println("Circunferência: " + circunferencia);
        System.out.println("Volume da Esfera: " + volumeEsfera);
        System.out.println("Volume do Cilindro: " + volumeCilindro);
    }
}