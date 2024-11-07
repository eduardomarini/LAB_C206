package exercicio_threads;

public class Main {
    
        public static void main(String[] args) {
            Thread thread1 = new Thread(new Thread_2_6());
            Thread thread2 = new Thread(new Thread_quadrado_1_5());
            Thread thread3 = new Thread(new Thread_1_10());
            
            thread1.start();
            thread2.start();
            thread3.start();
        }
}
