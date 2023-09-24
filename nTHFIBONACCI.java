import java.util.*;
public class nTHFIBONACCI {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        while(n>0){
            a = a+b;
            b = a-b;
            n--;
        }
    System.out.println(a);
    }
    
}
