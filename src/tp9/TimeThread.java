package tp9;

public class TimeThread extends  Thread{

    private int time  ;

    public TimeThread(int time){
        this.time = time ;
    }

    public int getTime() {
        return time;
    }
    public void run(){
        for(;this.time >0 ; this.time --){
            try{
                System.out.println("Il reste "+time+" secondes.");
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println("Thread TERMINE EXECUTED ---------");
    }
}
