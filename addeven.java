
import java.util.Scanner;

public class addevenindex {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int[] arr=new int[n];
        int sum=0;
        for(int i=0;i<n;i++)
        {
            arr[i]=obj.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            if(i%2==0)
            {
                sum+=arr[i];
            }
        }
        System.out.print(sum);
    }
}
