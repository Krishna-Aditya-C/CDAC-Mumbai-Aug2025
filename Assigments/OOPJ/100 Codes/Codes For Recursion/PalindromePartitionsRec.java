import java.util.Scanner;
class PalindromePartitionsRec {
    static boolean pal(String s){return s.equals(new StringBuilder(s).reverse().toString());}
    static void partition(String s,String ans){
        if(s.isEmpty()){System.out.println(ans);return;}
        for(int i=1;i<=s.length();i++){
            String pre=s.substring(0,i);
            if(pal(pre)) partition(s.substring(i),ans+pre+"|");
        }
    }
    public static void main(String[] args){
        partition(new Scanner(System.in).next(),"");
    }
}