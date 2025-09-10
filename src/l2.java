import java.util.Scanner;
public class l2
{
    public static void main(String[] args)
    {
        int sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value: ");
        int num=sc.nextInt();
        while(num>0)
        {
            sum=sum+(num%10);
            num=num/10;
        }
        System.out.println("Sum of the digit: "+sum);
    }
}
