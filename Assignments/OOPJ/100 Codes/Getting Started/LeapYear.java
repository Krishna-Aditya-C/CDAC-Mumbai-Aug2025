import java.util.Scanner;
class LeapYear {
    public static void main(String[] args) {
        int y=new Scanner(System.in).nextInt();
        if((y%400==0)||(y%4==0 && y%100!=0)) System.out.println("Leap");
        else System.out.println("Not Leap");
    }
}
