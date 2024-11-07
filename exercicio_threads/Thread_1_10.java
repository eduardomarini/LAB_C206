package exercicio_threads;

import java.util.concurrent.TimeUnit;

public class Thread_1_10 implements Runnable {

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("de 1 a 10 a cada 2 segundos: " + i);
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
