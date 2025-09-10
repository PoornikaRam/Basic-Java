import java.util.Scanner;
public class l6
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a=sc.nextInt();
        int original=a;
        int num=0;
        while(a!=0){
            num=(num*10)+a%10;
            a=a/10;
        }
        if(original == num){
            System.out.println("It is palindrome number");
        }
        else{
            System.out.println("It not");
        }
    }
}

