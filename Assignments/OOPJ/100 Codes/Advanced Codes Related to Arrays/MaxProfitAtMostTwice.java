class MaxProfitAtMostTwice{
    static int maxProfit(int[] p){
        int n=p.length;
        int[] left=new int[n],right=new int[n];
        int min=p[0];
        for(int i=1;i<n;i++){min=Math.min(min,p[i]);left[i]=Math.max(left[i-1],p[i]-min);}
        int max=p[n-1];
        for(int i=n-2;i>=0;i--){max=Math.max(max,p[i]);right[i]=Math.max(right[i+1],max-p[i]);}
        int ans=0;
        for(int i=0;i<n;i++) ans=Math.max(ans,left[i]+right[i]);
        return ans;
    }
    public static void main(String[] args){
        int[] p={3,3,5,0,0,3,1,4};
        System.out.println(maxProfit(p));
    }
}