class Palindrome{
    public static void main(String args[]){
        String s="madam";
        String r=new StringBuilder(s).reverse().toString();
        if(s.equals(r)) System.out.println("Palindrome");
        else System.out.println("Not Palindrome");
    }
}