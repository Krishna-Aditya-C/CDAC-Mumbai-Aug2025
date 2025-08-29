import java.util.Scanner;
class HexToDec {
    public static void main(String[] args) {
        String h=new Scanner(System.in).next();
        System.out.println(Integer.parseInt(h,16));
    }
}