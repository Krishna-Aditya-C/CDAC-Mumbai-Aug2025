import java.util.Scanner;
class DecodeCount {
    static int count(String s,int n){
        if(n==0||n==1)return 1;
        int c=0;
        if(s.charAt(n-1)>'0') c=count(s,n-1);
        if((s.charAt(n-2)=='1')||(s.charAt(n-2)=='2'&&s.charAt(n-1)<'7')) c+=count(s,n-2);
        return c;
    }
    public static void main(String[] args) {
        String s=new Scanner(System.in).next();
        System.out.println(count(s,s.length()));
    }
}