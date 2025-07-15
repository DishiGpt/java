import java.util.Scanner;

public class automorphic {
    public static void main(String[] s){
        int num;
        Scanner sc = new Scanner (System.in);
        System.out.println("enter the number: ");
        num=sc.nextInt();
        int temp=num,count=0;
        while(temp>0){
            count++;
            temp=temp/10;
        }
        int square=(int) Math.pow(num,2);
        int lastDigit = (int) (square%(Math.pow(10, count)));
        if(num == lastDigit)
            System.out.println(num+ " is an automorphic number.");
        else
            System.out.println(num+ " is not an automorphic number.");
    }
}
