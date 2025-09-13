import java.util.Scanner;
class RemoveDupRec {
    static String remove(String s){
        if(s.length()<=1)return s;
        if(s.charAt(0)==s.charAt(1))return remove(s.substring(1));
        return s.charAt(0)+remove(s.substring(1));
    }
    public static void main(String[] args){
        System.out.println(remove(new Scanner(System.in).next()));
    }
}