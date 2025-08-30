class BestTimeToBuySellStock{
    static int maxProfit(int[] p){
        int min=p[0],ans=0;
        for(int i=1;i<p.length;i++){if(p[i]-min>ans) ans=p[i]-min;if(p[i]<min) min=p[i];}
        return ans;
    }
    public static void main(String[] args){
        int[] p={7,1,5,3,6,4};
        System.out.println(maxProfit(p));
    }
}