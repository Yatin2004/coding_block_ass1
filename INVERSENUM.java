import java.util.*;
public class INVERSENUM {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int inv = 0;
        int pow = 1;
        while(n!=0){
            int d = n%10;
            n = n/10;
            inv += pow*Math.pow(10,d-1);
            pow++;
        }
        System.out.println(inv);
    }
    
}
