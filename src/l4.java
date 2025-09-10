import java.util.Scanner;

public class l4 {

    public static void main(String[] args) {
        boolean prime =true;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a=sc.nextInt();
        if(a<=1){
            prime=false;
        }
        for(int i=2;i<a/2;i++){
            if(a%i==0){
                prime=false;
            }
        }
        if(prime){
            System.out.println("It is Prime");
        }
        else{
            System.out.println("Not");
        }
    }

}
