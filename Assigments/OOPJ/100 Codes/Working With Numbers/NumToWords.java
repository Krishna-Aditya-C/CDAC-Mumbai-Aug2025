import java.util.Scanner;
class NumToWords {
    public static void main(String[] args) {
        String[] w={"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
        String s=new Scanner(System.in).next();
        for(char c:s.toCharArray()) System.out.print(w[c-'0']+" ");
    }
}