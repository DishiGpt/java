import java.util.Scanner;

public class area {
    public static void main(String[] s){
        int r;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter radius : ");
        r=sc.nextInt();
        System.out.println("area of circle is : "+((float)3.14*r*r));
    }
}
