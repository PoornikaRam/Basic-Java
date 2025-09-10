import java.util.Scanner;
public class s2
{
    public static void main(String[] args) {

        char ch;
        String r=" ";
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a string: ");
        String a=sc.nextLine();
        for(int i=0;i<a.length();i++){
            ch=a.charAt(i);
            r=ch+r;

        }
        System.out.println(r);
    }
}
