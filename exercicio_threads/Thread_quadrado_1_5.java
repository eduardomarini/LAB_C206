package exercicio_threads;

import java.util.concurrent.TimeUnit;

public class Thread_quadrado_1_5 implements Runnable {

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("o quadrado de 1 até 5 a cada 2 segundos: " + i * i);
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
