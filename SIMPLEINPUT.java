import java.util.*;
public class SIMPLEINPUT {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a = 0;
        while(a>=0){
            int n = sc.nextInt();
            a=a+n;
            if(a>=0){
                System.out.println(n);
            }
        }
    }
    
}
