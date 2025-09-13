class TrappingRainWater{
    static int trap(int[] h){
        int n=h.length,l=0,r=n-1,lm=0,rm=0,ans=0;
        while(l<r){
            if(h[l]<h[r]){if(h[l]>=lm)lm=h[l];else ans+=lm-h[l];l++;}
            else{if(h[r]>=rm)rm=h[r];else ans+=rm-h[r];r--;}
        }
        return ans;
    }
    public static void main(String[] args){
        int[] h={3,0,0,2,0,4};
        System.out.println(trap(h));
    }
}