package entrevistas;

public class PruebaThread implements Runnable {

    StringBuilder strBuilder;
    static volatile float sum = 0;

    public PruebaThread() {
        strBuilder = new StringBuilder();
    }

    @Override
    public void run() {
        for (int i = 0; i < 50000; i++) {
            agregarCaracter();
        }
    }

    public void agregarCaracter() {
        strBuilder.append("A");
    }

    public static void main(String[] args) {

        PruebaThread pruebaThread = new PruebaThread();
        Thread thread1 = new Thread(pruebaThread, "Thread 1");
        Thread thread2 = new Thread(pruebaThread, "Thread 2");
        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Longitud final del StringBuilder: " + pruebaThread.strBuilder.length());
    }
}