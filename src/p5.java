import java.util.Scanner;
public class p5
{
    public static void main(String[] args)
    {
        int i;
        int fact=1;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value: ");
        int f=sc.nextInt();
        for(i=1;i<=f;i++)
        {
            fact=fact*i;
            System.out.println("The Factorial of the number is: "+fact);
        }

    }

}
