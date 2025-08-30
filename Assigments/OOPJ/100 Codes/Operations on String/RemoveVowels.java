class RemoveVowels{
    public static void main(String args[]){
        String s="Hello World";
        StringBuilder sb=new StringBuilder();
        for(char c: s.toCharArray()) if("AEIOUaeiou".indexOf(c)==-1) sb.append(c);
        System.out.println(sb.toString());
    }
}