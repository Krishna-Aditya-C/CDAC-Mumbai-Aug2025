class WildcardMatch{
    static boolean match(String s,String p){
        if(p.isEmpty()) return s.isEmpty();
        if(p.charAt(0)=='*') return match(s,p.substring(1))||(s.length()>0&&match(s.substring(1),p));
        if(!s.isEmpty()&&(p.charAt(0)=='?'||p.charAt(0)==s.charAt(0))) return match(s.substring(1),p.substring(1));
        return false;
    }
    public static void main(String args[]){
        System.out.println(match("abcdef","a*e?f"));
    }
}