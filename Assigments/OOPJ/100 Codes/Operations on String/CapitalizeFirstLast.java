class CapitalizeFirstLast{
    public static void main(String args[]){
        String s="hello world";
        String[] words=s.split(" ");
        StringBuilder sb=new StringBuilder();
        for(String w:words){
            if(w.length()==1) sb.append(Character.toUpperCase(w.charAt(0)));
            else sb.append(Character.toUpperCase(w.charAt(0))).append(w.substring(1,w.length()-1)).append(Character.toUpperCase(w.charAt(w.length()-1)));
            sb.append(" ");
        }
        System.out.println(sb.toString().trim());
    }
}