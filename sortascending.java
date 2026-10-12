import java.util.Scanner;

public class sortascending {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int i=0;
        int j=n-1;
        while(i<j){
            if(arr[i]<=0){
                i++;
            }
            if(arr[j]>=0){
                j--;
            }

            if(arr[i] >=0 && arr[j]%2 <=0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;
            }
        }
        for(int k=0;k<n;k++){       
        System.out.print(arr[k]+" ");
    }
}
}
