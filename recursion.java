import java.util.*;
public class recursion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            System.out.print(i+" ");
        }
        System.out.println("  ");
        fun(n,1);
        
    }
    static void fun(int n,int i){
    if(i>n)return;
    System.out.print(i+" ");
    fun(n,i+1);
    System.out.print(i+" ");
    }
}
