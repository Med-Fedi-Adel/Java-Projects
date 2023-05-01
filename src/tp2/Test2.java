package tp2;

public class Test2 {
    public static void main(String[] args) {
        Example e1 = new Example() ;
        Example e2 = new Example() ;
        Example e3 = new Example() ;
        Example e4 = new Example() ;

        e1 = null ;
        e2 = e3 ;
        e3.e = e4 ;
        e4.e = e3 ;
        e2 = null ;
        e3 = null  ;
        e4 = null ;

        System.gc();
        System.out.println("Waiting");
        System.out.println("Waiting");
    }


}

class Example{
    Example e ;
    protected void finalize() throws Throwable{
        System.out.println("tp2.Example finalize");
    }
}