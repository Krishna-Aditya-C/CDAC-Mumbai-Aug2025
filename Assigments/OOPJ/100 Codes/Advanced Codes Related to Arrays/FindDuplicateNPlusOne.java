class FindDuplicateNPlusOne{
    static int find(int[] a){
        int s=a[0],f=a[0];
        do{s=a[s];f=a[a[f]];}while(s!=f);
        s=a[0];
        while(s!=f){s=a[s];f=a[f];}
        return s;
    }
    public static void main(String[] args){
        int[] a={1,3,4,2,2};
        System.out.println(find(a));
    }
}