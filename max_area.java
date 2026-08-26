import java.util.*;
public class max_area {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int max=0;
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n-1;i++){
            for(int j=n-1;j>0;j--){
                int min=Math.min(arr[i],arr[j]);
                int width=j-1;
                int area=width*min;
                max=Math.max(max,area);
            }
        }
        System.out.println(max);

    }
}
