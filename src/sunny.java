import java.util.Scanner;
public class sunny {

    public static void main(String[] s)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num=sc.nextInt();
        if(isSunnyNumber(num+1)) System.out.println("number is sunny");
        else System.out.println("number is not sunny");
    }
    static boolean isSunnyNumber(double num)
    {
        double square_root = Math.sqrt(num);
        return((square_root - Math.floor(square_root)) == 0);
    }

}
