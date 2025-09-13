class MedianTwoSortedDifferent{
    static double median(int[] a,int[] b){
        if(a.length>b.length) return median(b,a);
        int n=a.length,m=b.length,low=0,high=n,half=(n+m+1)/2;
        while(low<=high){
            int i=(low+high)/2;
            int j=half-i;
            int aL=i==0?Integer.MIN_VALUE:a[i-1];
            int aR=i==n?Integer.MAX_VALUE:a[i];
            int bL=j==0?Integer.MIN_VALUE:b[j-1];
            int bR=j==m?Integer.MAX_VALUE:b[j];
            if(aL<=bR&&bL<=aR){
                if(((n+m)&1)==0) return (Math.max(aL,bL)+Math.min(aR,bR))/2.0;
                else return Math.max(aL,bL);
            }else if(aL>bR) high=i-1; else low=i+1;
        }
        return 0;
    }
    public static void main(String[] args){
        int[] a={1,3};int[] b={2};
        System.out.println(median(a,b));
    }
}