class CountVowels{
    public static void main(String args[]){
        String s="Hello";
        int count=0;
        for(char c: s.toCharArray()) if("AEIOUaeiou".indexOf(c)!=-1) count++;
        System.out.println(count);
    }
}