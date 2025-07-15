import java.util.Scanner;

public class trying {
    public static void main(String[] s){
        int n;
        String[] first ={"","One Hundred","Two hundred","Three Hundred","Four Hundred","Five Hundred","Six hundred","Seven Hundred","Eight hundred","Nine Hundred"};

        String[] second={"","","Twenty","Thirty","Forty","Fifty","Sixty","Seventy","Eighty","Ninty","Twenty"};

        String[] second2={"Ten","Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen"};

        String[] third={"","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};

        Scanner sc = new Scanner (System.in);
        System.out.print("Enter Any Number : ");
        n=sc.nextInt();

        if(n%100>=10 && n%100<20)
            System.out.print(first[n/100]+" "+second2[n%10]);
        else
            System.out.print(first[n/100]+" "+second[(n/10)%10]+" "+third[n%10]);

    }
}
