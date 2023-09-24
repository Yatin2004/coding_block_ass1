import java.util.*;
public class SUMODDEVENPLACED {
   public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int N=sc.nextInt(),i=1,dig,evn_sm=0,odd_sm=0;
        while(N>0){
            dig=N%10;
            if(i%2==0)
            evn_sm+=dig;
            else
            odd_sm+=dig;
            N/=10;
            i+=1;
        }
        System.out.printf("%d\n%d",odd_sm,evn_sm);
	

    }
}