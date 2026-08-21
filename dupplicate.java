import java.util.*;
public class dupplicate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        boolean found=false;
        for(int i=0;i<n-1;i++){
            if(arr[i]==arr[i+1]){
                System.out.println("duplicate found: "+arr[i]);
                found=true;
                break;
            }
        }
            if(!found){
                System.out.println("duplicate not found");
            }
        
    }
}
