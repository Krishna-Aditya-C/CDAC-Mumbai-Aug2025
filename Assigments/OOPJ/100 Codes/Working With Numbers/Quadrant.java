import java.util.Scanner;
class Quadrant {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt(),y=sc.nextInt();
        if(x>0&&y>0)System.out.println("Q1");
        else if(x<0&&y>0)System.out.println("Q2");
        else if(x<0&&y<0)System.out.println("Q3");
        else if(x>0&&y<0)System.out.println("Q4");
        else System.out.println("Axis");
    }
}