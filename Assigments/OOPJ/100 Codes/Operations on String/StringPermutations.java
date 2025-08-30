import java.util.*;
class StringPermutations{
    static void permute(String s,String ans,Set<String> set){
        if(s.length()==0) set.add(ans);
        for(int i=0;i<s.length();i++) permute(s.substring(0,i)+s.substring(i+1),ans+s.charAt(i),set);
    }
    public static void main(String args[]){
        String s="abc";
        Set<String> set=new TreeSet<>();
        permute(s,"",set);
        for(String str:set) System.out.println(str);
    }
}