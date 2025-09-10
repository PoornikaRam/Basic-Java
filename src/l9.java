import java.util.Scanner;
public class l9{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter a number a: ");
        int a = sc.nextInt();
        int original = a;
        int d;
        int sum=0;
        while (a!=0){
            d = a%10;
            sum += d*d*d;
            a=a/10;
        }
        if (original == sum)
            System.out.println ("Armstrong");
        else
            System.out.println("Not");

    }
}
