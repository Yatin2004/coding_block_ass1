import java.util.*;
public class ISARMSTRONG {
    public static void main(String args[]) {
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
System.out.println(Is_Armstrong_numbder(n));
    }
    public static boolean Is_Armstrong_numbder(int n){
        int c = Countofdigit(n);
        int sum = 0;
        int p = n;
        while(n>0){
            int rem = n % 10;
            sum = (int) (sum + Math.pow(rem,c));
            n = n/10;
        }
        if(sum==p){
            return true;
        }
        else{
            return false;
        }
    }
    public static int Countofdigit(int n){
        int count = 0;
        while(n>0){
            n = n/10;
            count++;
        } 
        return count;
    }
}