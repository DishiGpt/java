import java.util.Scanner;

import static java.lang.Math.pow;

public class armstrong {
    public static void main(String[] s){
        int n,sum=0,digits=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check :");
        n=sc.nextInt();
        int copy=n;
        while(copy>0){
            digits++;
            copy=copy/10;
        }
        copy=n;
        while(copy>0){
            sum+=pow((copy%10),digits);
            copy=copy/10;
        }
        if(sum==n) System.out.println("number is armstrong");
        else System.out.println("number is not armstrong");
    }
}
