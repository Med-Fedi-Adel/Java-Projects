package tp9;

public class MyThread {
    public static void main(String[] args) {
        for(String time : args){
            TimeThread timeThread = new TimeThread(Integer.parseInt(time)) ;
            timeThread.start();
        }
    }
}
