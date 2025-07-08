import java.util.Scanner;
public class pro1 {
    public static void main(String[] s){
        int year;
        System.out.println("Enter year : ");
        Scanner sc = new Scanner(System.in);
        year=sc.nextInt();
        if((year%100==0 && year%400==0)||(year%4==0 && year%100!=0)) {
            System.out.println("leap year");
        }
        else {
            System.out.println("not a leap year");
        }
    }
}
