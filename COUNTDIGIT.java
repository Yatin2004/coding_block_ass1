import java.util.*;
public class COUNTDIGIT {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
		int Digit=sc.nextInt();
        int c=0;
		while(N>0){
			if(N%10==Digit)
			c+=1;
			N/=10;
		}
		System.out.println(c);
    }
    
}
