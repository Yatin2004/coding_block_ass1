import java.util.*;
public class GCD{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int div = sc.nextInt();
        int divd = sc.nextInt();
        while(divd%div!=0){
            int r = divd%div;
            divd = div;
            div = r;
        }
    System.out.println(div);
    }

}