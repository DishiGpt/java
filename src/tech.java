import java.util.Scanner;

public class tech {
    public static void main(String[] s){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number : ");
        int num=sc.nextInt();
        if(check(num)) System.out.println("number is tech");
        else
            System.out.println("number is not tech");
    }
    public static boolean check(int num){
        int digits=0;
        int temp=num;
        while(temp>0){
            digits++;
            temp/=10;
        }
        digits/=2;temp=num;
        int sum=num%(int)Math.pow(10,digits)+num/(int)Math.pow(10,digits);
        return(sum*sum==temp);
    }
}
