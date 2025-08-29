import java.util.Scanner;
class PermutationsRec {
    static void permute(String s,String ans){
        if(s.isEmpty()){System.out.println(ans);return;}
        for(int i=0;i<s.length();i++)
            permute(s.substring(0,i)+s.substring(i+1),ans+s.charAt(i));
    }
    public static void main(String[] args){
        permute(new Scanner(System.in).next(),"");
    }
}