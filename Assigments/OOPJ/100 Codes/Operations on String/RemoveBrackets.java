class RemoveBrackets{
    public static void main(String args[]){
        String s="(a+b)-(c*d)";
        System.out.println(s.replaceAll("[(){}\\[\\]]",""));
    }
}