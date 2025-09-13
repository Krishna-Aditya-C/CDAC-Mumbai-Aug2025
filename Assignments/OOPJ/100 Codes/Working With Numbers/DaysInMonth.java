import java.util.Scanner;
class DaysInMonth {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt(),y=sc.nextInt();
        int d=(m==2)?((y%400==0||y%4==0&&y%100!=0)?29:28):(m==4||m==6||m==9||m==11)?30:31;
        System.out.println(d);
    }
}