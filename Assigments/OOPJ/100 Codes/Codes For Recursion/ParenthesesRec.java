import java.util.Scanner;
class ParenthesesRec {
    static void generate(String s,int o,int c,int n){
        if(s.length()==2*n){System.out.println(s);return;}
        if(o<n)generate(s+"(",o+1,c,n);
        if(c<o)generate(s+")",o,c+1,n);
    }
    public static void main(String[] args){
        generate("",0,0,new Scanner(System.in).nextInt());
    }
}