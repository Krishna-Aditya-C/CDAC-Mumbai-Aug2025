class SumOfNumbersInString{
    public static void main(String args[]){
        String s="a1b2c3";
        int sum=0;
        for(char c: s.toCharArray()) if(Character.isDigit(c)) sum+=c-'0';
        System.out.println(sum);
    }
}