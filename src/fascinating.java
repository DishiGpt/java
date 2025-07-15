import java.util.Arrays;
import java.util.Scanner;

import static java.util.Collections.sort;

public class fascinating {
    public static void main(String[] s){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int num=sc.nextInt();
        if(check(num)) System.out.println("number is fascinating");
        else System.out.println("number is not fascinating");
    }
    public static boolean check(int num){
        String result=""+num+num*2+num*3;
        char[] chars = result.toCharArray();
        Arrays.sort(chars);
        if(result.length()<9)return false;
        for(int i=0;i<9;i++){
            char ch = (char) ((i+1) + '0');
            if(chars[i]!=ch)return false;
        }
        return true;
    }
}
