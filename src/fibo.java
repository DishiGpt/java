import java.sql.SQLOutput;
import java.util.Scanner;

public class fibo {
    public static void main(String[] s){
        int a=0,b=1;int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many numbers in fibonacci series :");
        n=sc.nextInt();
        System.out.print(a);
        System.out.print(b);
        for(int i=0;i<n-2;i++){
            int c=b;
            b=a+b;
            a=c;
            System.out.print(b);
        }

    }
}
