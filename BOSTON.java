import java.util.Scanner;
public class BOSTON {
    public static Boolean prime(long p){ 
        for(int i=2; i<=p/2; i++){
            if(p%i==0){
                return false;
            }
        }
        return true;
    }
    public static long smdig(long p){
        int sm = 0;
        while(p>0){
            sm += p%10;
            p /= 10;
        }
        return sm;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        long N = sc.nextInt();
        if(N<=1){
            System.out.println("0");
        }
        else{
            long sum_digits = smdig(N);
            long sum = 0;
            for(int i=2; i<=N; i++){
                while((N%i==0) && prime(i)){
                    sum += smdig(i);
                    N = N/i;
                }       
            }
            if(N>1 && prime(N) ){
                sum += smdig(N);
            }           
            if(sum==sum_digits){
                System.out.println("1");
            }
            else{
                System.out.println("0");
            }
        }
        sc.close();
        
    }
    

}