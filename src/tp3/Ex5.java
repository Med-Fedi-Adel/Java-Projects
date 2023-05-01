package tp3;

public class Ex5 {
    public static void main(String[] args) {
        int a = 2<<30 ;
        int b = foo(a) ;
        int c = bar(b);
        int d = buz(c) ;
        System.out.println(d);
    }
    static int foo(int x ){
        assert(x>=0) : "Problem at foo" ;
        return x+ 2 ;
    }

    static int bar(int x ){
        assert(x>=0) : "Problem at bar" ;
        return x* 2 ;
    }

    static int buz(int x ){
        assert(x>=0) : "Problem at buz" ;
        return (int) Math.pow(x,2) ;
    }
}
