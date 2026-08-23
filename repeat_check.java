import java.util.*;
public class repeat_check {
    public static void main(String[] args) {
        //int seen[]=new int[256];
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n]; 
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        if(arr[0]!=arr[1]){
            System.out.println(arr[0]);
        }
        if(arr[n-1]!=arr[n-2]){
            System.out.println(arr[n-1]);
        }
        for(int i=1;i<n-1;i++){
            if(arr[i]!=arr[i+1] && arr[i]!=arr[i-1]){
                System.out.println(arr[i]);
            }
        }
    }
}
