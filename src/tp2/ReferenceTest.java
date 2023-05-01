package tp2;

public class ReferenceTest {
    public static void main(String[] args) {
        int a= 1 ;
        ReferenceTest rt = new ReferenceTest() ;
        System.out.println("Before modify() a="+a);
        rt.modify(a) ;
        System.out.println("After modify() a = "+a);
    }

    void modify(int number){
        number++ ;
        System.out.println("number = "+number);
    }
}
