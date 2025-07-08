import java.util.Scanner;

public class pro2 {
    public static void main(String[] s){
        int n1,n2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        n1=sc.nextInt();
        System.out.println("Enter number : ");
        n2=sc.nextInt();
        if(n1/n2!=0) System.out.println("number is greater"+n1);
        else System.out.println("number is greater"+n2);
    }
}
