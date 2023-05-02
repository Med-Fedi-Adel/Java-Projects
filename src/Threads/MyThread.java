package Threads;

public class MyThread {
    public class myThread implements Runnable {

        private int tempsRestant ;

        public  int[] e={0} ;

        public int getTempsRestant() {
            return tempsRestant;
        }

        public void setTempsRestant(int tempsRestant) {
            this.tempsRestant = tempsRestant;
        }

        public void run() {
            while (tempsRestant > 0) {
                System.out.println("Il reste " + tempsRestant + " seconde(s)");
                e[0] = tempsRestant ;
                tempsRestant--;
                try {
                    Thread.sleep(1000); // Pause d'une seconde
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("Le thread a termine son execution !");
        }

    }
}
