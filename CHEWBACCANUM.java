import java.util.*;
public class CHEWBACCANUM {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        long n = sc.nextLong();
    long r = 0;
    long a = 0;
    long d = 0;
    long m = 0;
    while(n>0){
        d=n%10;
        m = m*10+d;
        n/=10;
    }
    int e = 0;
    while(m>0){
        d = m%10;
        long d1 = 9-d;
        if(d==9 && e==0){
            d = 9;
            e = 1;
        }
        else{
            if(d>d1){
                d = d1;
            }
        }
        r = r*10+d;
        m = m/10;
        }
        System.out.println(r);


    }
    
}
