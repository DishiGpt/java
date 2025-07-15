import java.util.Scanner;

public class emirp {
    public static void  main(String[] s){
        Scanner sc=new Scanner(System.in);
        int num;
        System.out.println("enter the number : ");
        num=sc.nextInt();
        if(check(num)) System.out.println("number is emirp");
        else System.out.println("number is not emirp");
    }
    public static boolean check(int num){
        int temp=num;int pal=0;
        while(temp>0){
            pal=pal*10+temp%10;
            temp/=10;
        }
        if(pal!=num){
            return(prime(num)&&prime(pal));
        }
        return false;
    }
    public static boolean prime(int num){
        boolean flag=true;
        for(int i=2;i<(int)Math.sqrt(num);i++){
            if(num%i==0){
                flag=false;
                break;
            }
        }
        return flag;
    }
}
