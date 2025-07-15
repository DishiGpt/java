import java.util.Scanner;

public class peterson {
    public static void main(String[] s){
        Scanner sc=new Scanner(System.in);
        int num;
        System.out.println("enter the number : ");
        num=sc.nextInt();
        if(check(num)) System.out.println("number is peterson");
        else System.out.println("number is not peterson");
    }
    public static boolean check(int num){
        int temp=num,sum=0;
        while(temp>0){
            sum+=fact(temp%10);
            temp=temp/10;
        }
        return (num==sum);
    }
    public static int fact(int num){
        int sum=1;
        for(int i=1;i<=num;i++){
            sum*=i;
        }
        return sum;
    }
}
