import java.util.Scanner;
class CountDigit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next(),d=sc.next();
        System.out.println(s.length()-s.replace(d,"").length());
    }
}