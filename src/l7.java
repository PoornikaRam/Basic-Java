import java.util.Scanner;
public class l7{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter a number a: ");
        int a = sc.nextInt();
        System.out.println(" enter a number b: ");
        int b = sc.nextInt();
        System.out.println("enter a number c: ");
        int c = sc.nextInt();
        if (a>b & a>c)
            System.out.println("a is greater");
        else if (b>a && b>c)
            System.out.println("b is greater");
        else
            System.out.println("c is greater");


    }
}
