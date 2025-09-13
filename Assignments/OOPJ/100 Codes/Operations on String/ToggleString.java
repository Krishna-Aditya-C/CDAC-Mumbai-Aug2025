class ToggleString{
    public static void main(String args[]){
        String s="HeLLo";
        StringBuilder sb=new StringBuilder();
        for(char c: s.toCharArray()){
            if(Character.isUpperCase(c)) sb.append(Character.toLowerCase(c));
            else sb.append(Character.toUpperCase(c));
        }
        System.out.println(sb.toString());
    }
}