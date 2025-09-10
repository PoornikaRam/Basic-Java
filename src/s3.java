import java.util.Scanner;
public class s3
{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int a=sc.nextInt();
        int[] arr=new int[a];
        System.out.println("Enter " + a + " elements:");
        for (int i = 0; i < a; i++) {
            arr[i] = sc.nextInt();         }

        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(max);
    }
}
