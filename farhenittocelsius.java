import java.util.*;
public class farhenittocelsius {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int minimum = sc.nextInt();
        int maximum = sc.nextInt();
        int step = sc.nextInt();
        int f = minimum;
        for (; f <= maximum; f+=step){
        int rem =(f-32)*5/9;
        int number = rem; 
        System.out.println(f+" "+rem);
    }
    
}
}
