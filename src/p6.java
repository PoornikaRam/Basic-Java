import java.util.Scanner;
public class p6
{
    public static void main(String[] args)
    {
        int i;
        int res;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value: ");
        int num=sc.nextInt();
        for(i=1;i<=10;i++)
        {
            res=num*i;
            System.out.println(num+"*"+i+"="+res);
        }

    }

}
