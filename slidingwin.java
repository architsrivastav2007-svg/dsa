import java.util.*;
public class slidingwin {
    public static void main(String[] args) {
        int c=0;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int w=sc.nextInt();
        for(int i=0;i<w;i++){
            c=c+arr[i];
        }
        int max=c;
        for(int i=1;i<=n-w;i++ ){
            c=c-arr[i-1]+arr[i+w-1];
            if(c>max){
                max=c;
            }
        }
        System.out.println(max);
    }
}
