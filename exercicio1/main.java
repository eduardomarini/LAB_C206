public class main {

    public  static int mostraPares(int n) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if(i % 2 == 0) {
                System.out.println(i);
                count++;
            }
        }
        return count;
    }

    public static int calculoFatorial(int n) {
        int fatorial = 1;
        for (int i = 1; i <= n; i++) {
            fatorial *= i;
        }
        return fatorial;
    }

    public static void main(String[] args) {
        int n = 10;
        int resultado = mostraPares(n);
        System.out.println("Quantidade de pares: " + resultado);
        System.out.println("Fatorial é igual a: " + calculoFatorial(n));
    }
}