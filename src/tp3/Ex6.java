package tp3;

public class Ex6 {
    public static void main(String[] args) {
        String x = "Java" ;
        x = x.concat("Rules! ") ;
        System.out.println("x = "+x);
        x.toLowerCase();
        System.out.println("x :"+x );
        x= x.toLowerCase() ;
        System.out.println("x :"+x );


        String s1 ="spring " ;
        String s2 = s1 + " summer" ;
        s1.concat("fall") ;
        s2.concat(s1) ;
        s1+= "winter" ;
        System.out.println(s1+" "+s2);
    }
}
