package tp3;

public class Ex1 {
    public static void main(String[] args) {
        int x =3 ;
        if(x >5){
            System.out.println("x is  greater than 5");
        }else {
            System.out.println("x is not greater than 5 ");
        }

        switch(x){
            case 1 :
                System.out.println("x ==1"); break ;
            case 2 :
                System.out.println("x==2"); break ;
            default:
                System.out.println("x different than 1 and 2"); break;
        }

        while(x > 0){
            System.out.println("x = "+x);
            --x ;
        }
        System.out.println("end of while");
        do {
            System.out.println("x= "+x);
        }while (x>0) ;
    }
}
