import java.util.Scanner;

public class search {
   public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int tar=sc.nextInt();
        int h=0;
        int hu=0;
       for(int i=0;i<n;i++){
            if(arr[i]==tar){
                h=i;
                hu=arr[i];
            } 
        }
        if(arr[h]==hu){
            System.out.println(h);
        }
        else{
            System.out.println(-1);
        }
        }
   } 
