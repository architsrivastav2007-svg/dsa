import java.util.*;
public class max_min {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            sum=sum+arr[i];
        }
        Arrays.sort(arr);
        System.out.println("min:"+arr[0]);
        System.out.println("max:"+arr[n-1]);
        System.out.println("avg:"+sum/n);
    }
}
