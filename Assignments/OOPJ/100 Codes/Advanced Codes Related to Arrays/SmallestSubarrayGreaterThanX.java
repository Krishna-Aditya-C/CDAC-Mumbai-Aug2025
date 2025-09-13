class SmallestSubarrayGreaterThanX{
    static int minLen(int[] a,int x){
        int n=a.length,ans=n+1,s=0,l=0;
        for(int r=0;r<n;r++){
            s+=a[r];
            while(s>x){ans=Math.min(ans,r-l+1);s-=a[l++];}
        }
        return ans==n+1?0:ans;
    }
    public static void main(String[] args){
        int[] a={1,4,45,6,0,19};
        System.out.println(minLen(a,51));
    }
}