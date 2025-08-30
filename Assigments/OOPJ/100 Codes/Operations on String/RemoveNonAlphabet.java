class RemoveNonAlphabet{
    public static void main(String args[]){
        String s="He@123llo!";
        System.out.println(s.replaceAll("[^a-zA-Z]",""));
    }
}