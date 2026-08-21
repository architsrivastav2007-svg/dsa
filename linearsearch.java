import java.util.*;
public class linearsearch {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    int k=sc.nextInt();
    boolean found=false;
    for(int i=0;i<n;i++){
        if(arr[i]==k){
            System.out.println("element "+k+" found at "+i);
            found=true;
            break;
        }}
        if(!found){
            System.out.println("element "+k+" not found");
        }
    }
    }

