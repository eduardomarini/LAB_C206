package exercicio_threads;

import java.util.concurrent.TimeUnit;

public class Thread_2_6 implements Runnable {

    @Override
    public void run() {
        for (int i = 1; i <= 6; i++) {
            System.out.println("de 2 a 6 a cada 4 segundos: " + i);
            try {
                TimeUnit.SECONDS.sleep(4);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    
}
