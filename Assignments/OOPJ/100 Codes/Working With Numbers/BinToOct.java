import java.util.Scanner;
class BinToOct {
    public static void main(String[] args) {
        String b=new Scanner(System.in).next();
        System.out.println(Integer.toOctalString(Integer.parseInt(b,2)));
    }
}