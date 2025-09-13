class LargestSumSubarray{
    static int maxSubarray(int[] a){
        int best=a[0],cur=a[0];
        for(int i=1;i<a.length;i++){cur=Math.max(a[i],cur+a[i]);best=Math.max(best,cur);}
        return best;
    }
    public static void main(String[] args){
        int[] a={-2,-3,4,-1,-2,1,5,-3};
        System.out.println(maxSubarray(a));
    }
}