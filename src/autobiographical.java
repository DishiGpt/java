import java.util.Scanner;

public class autobiographical {
    public static void  main(String[] s){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int num=sc.nextInt();
        if(check(num)) System.out.println("number is autobiographical");
        else System.out.println("number is not autobiographical");
    }
    public static boolean check(int num){
        int temp=num;int digit=0;
        while(temp>0){
            digit++;
            temp/=10;
        }
        temp=num;
        int[] freq=new int[digit];
        int c=digit-1;
        while(temp>0){
            freq[c--]=temp%10;
            temp/=10;
        }
        for(int i=0;i<digit;i++){
            int count=0;
            for(int j=0;j<digit;j++){
                if(freq[j]==i)count++;
            }
            if(count!=freq[i])return false;
        }
        return true;
    }
}
