class ReplaceWord{
    public static void main(String args[]){
        String s="I love programming";
        System.out.println(s.replaceAll("\blove\b","enjoy"));
    }
}