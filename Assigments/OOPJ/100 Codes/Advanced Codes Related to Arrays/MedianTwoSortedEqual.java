class MedianTwoSortedEqual{
    static double median(int[] a,int[] b){
        int n=a.length,i=0,j=0,prev=-1,curr=-1;
        for(int k=0;k<=n;k++){
            prev=curr;
            if(i<n&&(j==n||a[i]<=b[j])) curr=a[i++]; else curr=b[j++];
        }
        return (prev+curr)/2.0;
    }
    public static void main(String[] args){
        int[] a={1,12,15,26,38};
        int[] b={2,13,17,30,45};
        System.out.println(median(a,b));
    }
}