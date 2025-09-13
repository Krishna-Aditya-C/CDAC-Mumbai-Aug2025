import java.util.*;
class CharFrequency{
    public static void main(String args[]){
        String s="hello";
        Map<Character,Integer> map=new HashMap<>();
        for(char c:s.toCharArray()) map.put(c,map.getOrDefault(c,0)+1);
        for(char c:map.keySet()) System.out.println(c+" "+map.get(c));
    }
}