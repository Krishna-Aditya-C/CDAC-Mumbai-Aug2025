class MinJumps{
    static int minJumps(int[] a){
        if(a.length<=1) return 0;
        if(a[0]==0) return -1;
        int jumps=1,steps=a[0],maxReach=a[0];
        for(int i=1;i<a.length;i++){
            if(i==a.length-1) return jumps;
            maxReach=Math.max(maxReach,i+a[i]);
            steps--;
            if(steps==0){
                jumps++;
                if(i>=maxReach) return -1;
                steps=maxReach-i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int[] a={1,3,5,8,9,2,6,7,6,8,9};
        System.out.println(minJumps(a));
    }
}