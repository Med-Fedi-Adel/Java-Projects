package tp4_linux_commands;

public class Ex1 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("abc") ;
        sb.append("def") ;
        System.out.println("sb =  "+sb);

        StringBuilder sb1 = new StringBuilder("abc" );
        sb1.append("def").reverse().insert(3,"---") ;
        System.out.println(sb1);
    }
}
