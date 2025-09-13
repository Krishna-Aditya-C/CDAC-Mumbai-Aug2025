class MinOpsMakeArrayPalindrome{
    static int minOps(int[] a){
        int i=0,j=a.length-1,ops=0;
        while(i<j){
            if(a[i]==a[j]){i++;j--;}
            else if(a[i]<a[j]){a[i+1]+=a[i];i++;ops++;}
            else{a[j-1]+=a[j];j--;ops++;}
        }
        return ops;
    }
    public static void main(String[] args){
        int[] a={1,4,5,1};
        System.out.println(minOps(a));
    }
}