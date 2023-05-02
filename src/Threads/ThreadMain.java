package Threads;

public class ThreadMain {
    public static void main(String[] args) {
        // Création du thread
        for (String a : args) {
            MyThread t = new MyThread();
            int s = Integer.parseInt(a);
            t.setTempsRestant(s);
            Thread thread = new Thread(t);
            // Lancement du thread
            thread.start();
        }
    }
}
