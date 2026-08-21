import java.util.*;
public class longest_substring {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int l=0;
        int max=0;
        int seen[]=new int [256];
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(seen[c]>0){
                l=Math.max(l,seen[c]);
            }
            seen[c]=i+1;
            max=Math.max(max,i-l+1);
        }
        System.out.println(max);

    }
}
