import java.util.Scanner;

public class license {
    public static void main(String[] s){
        Scanner sc=new Scanner(System.in);
        char s1;
        System.out.println("are you Indian(y/n) : ");
        s1=sc.next().charAt(0);
        if(s1=='y'){
            System.out.println("are you eligible to vote (y/n) : ");
            s1=sc.next().charAt(0);
            if(s1=='y') {
                System.out.println("you are eligible to get a driver's license");
            }
            else{
                System.out.println("you are not eligible to get a driver's license");
            }
        }
        else{
            System.out.println("you are not eligible to get a driver's license");
        }
    }
}
