import java.util.Scanner;

public class bill {
    public static void main(String[] s){
        Scanner sc= new Scanner(System.in);
        int unit,amt=500;
        System.out.println("enter unit :");
        unit= sc.nextInt();
        if(unit <= 100) {
        } else if (unit <= 200) {
            amt += (unit - 100) * 2;
        } else if (unit <= 300) {
            amt = 700 + (unit - 200) * 3;
        } else if (unit <= 400) {
            amt = 1000 + (unit - 300) * 4;
        } else if (unit <= 500) {
            amt = 1400 + (unit - 400) * 5;
        }
        System.out.println("the bill is :"+amt);
    }
}
