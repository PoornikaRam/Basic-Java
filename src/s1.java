import java.util.Scanner;
public class s1
{
    public static void main(String[] args) {

        int count=0;

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a string: ");
        String a=sc.nextLine();
        a=a.toLowerCase();
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)=='a' || a.charAt(i)=='e' || a.charAt(i)=='i' || a.charAt(i) =='o' || a.charAt(i)=='u'){
                count++;
            }
        }
        System.out.println(count);
    }
}
