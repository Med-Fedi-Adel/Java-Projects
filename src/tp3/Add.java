package tp3;

public class Add {
    public static void main(String[] args) {
        final int len = args.length ;
        int i= 0 ;

        int sum = 0 ;
        while(i < len ){
            try{
                sum += Integer.parseInt(args[i]) ;
            }catch (Exception e ){
                System.out.println("Bad input " + args[i]);
                break ;
            }
            i++ ;
        }
        if(i == len){
            System.out.println(sum);
        }
    }
}
