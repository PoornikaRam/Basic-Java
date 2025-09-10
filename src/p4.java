import java.util.Scanner;
public class p4
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter pie: ");
        int pie=sc.nextInt();
        System.out.print("Enter Radius: ");
        int rad=sc.nextInt();
        int c=pie*rad*rad;
        System.out.println("The Area of the Circle is "+c);
    }
}

