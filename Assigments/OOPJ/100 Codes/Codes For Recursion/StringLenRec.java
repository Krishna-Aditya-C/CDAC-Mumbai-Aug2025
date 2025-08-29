import java.util.Scanner;
class StringLenRec {
    static int length(String s){return s.equals("")?0:1+length(s.substring(1));}
    public static void main(String[] args){
        System.out.println(length(new Scanner(System.in).nextLine()));
    }
}