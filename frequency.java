import java.util.*;
public class frequency {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int freq[]=new int[100];
        for(int i=0;i<n;i++){
            freq[arr[i]]++;
        }
        int q=sc.nextInt();
        while(q>0){
            System.out.println("enter number to be searched");
            int num=sc.nextInt();
            if(freq[num]>0){
                System.out.println(num+" is present ");
            }
            q--;
        }
    }
}
