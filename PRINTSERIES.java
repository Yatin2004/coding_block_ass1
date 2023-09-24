import java.util.*;
public class PRINTSERIES {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int i = 1;
        while(n1!=0){
            int n = (3*i)+2;
            if(n%n2>0){
                System.out.println(n);
                n1--;
            }
            i++;
        }

    }
    
}
