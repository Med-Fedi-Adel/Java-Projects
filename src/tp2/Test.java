package tp2;

public class Test {
    public static void main(String[] args) {
        Integer i1 =1000 ;
        Integer i2 = 1000 ;

        if(i1!=i2) System.out.println("Different objects");
        if(i1.equals(i2)) System.out.println("Meaningfully equal");

        Integer i3 = 10 ;
        Integer i4 = 10 ;
        if(i3 == i4) System.out.println("same object");
        if(i3.equals(i4)) System.out.println("Meaningfully equal");
    }
}
