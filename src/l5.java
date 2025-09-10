import java.util.Scanner;

public class l5 {

    public static void main(String[] args) {
        int n1=0;
        int n2=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a=sc.nextInt();
        System.out.print(n1);
        for(int i=0;i<a;i++){
            System.out.print(", "+n2);
            int n3=n1+n2;
            n1=n2;
            n2=n3;
        }



    }
}
