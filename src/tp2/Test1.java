package tp2;

public class Test1 {
    static void foo(long x){
        System.out.println("long");
    }

    static void foo(Integer x){
        System.out.println("boxing");
    }

    static void foo(Integer x , Integer y) {
        System.out.println("boxing * 2 ");
    }

    static void foo(long... x ){
        System.out.println("var-args");
    }

    public static void main(String[] args) {
        int i =5 ;
        foo(i) ;
        foo(i,i) ;
        foo(i,i,i);
    }
}
