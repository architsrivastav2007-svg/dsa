import java.util.*;
public class rotate_at_k {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int ans[]=new int[n];
        int k=sc.nextInt();
        k=k%n;
        int j=0;
        for(int i=n-k;i<n;i++){
            ans[j++]=arr[i];
        }
        for(int i=0;i<n-k;i++){
            ans[j++]=arr[i];
        
    }
    for(int i=0;i<n;i++){
        System.out.print(ans[i]);
    }
}
}
