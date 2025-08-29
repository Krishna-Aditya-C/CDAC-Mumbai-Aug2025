import java.util.Scanner;
class OctToBin {
    public static void main(String[] args) {
        String o=new Scanner(System.in).next();
        System.out.println(Integer.toBinaryString(Integer.parseInt(o,8)));
    }
}