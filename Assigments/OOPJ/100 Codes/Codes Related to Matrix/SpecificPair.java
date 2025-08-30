class SpecificPair{
    static int findMaxValue(int[][] m){
        int n=m.length;
        int maxValue=Integer.MIN_VALUE;
        int[][] maxArr=new int[n][n];
        maxArr[n-1][n-1]=m[n-1][n-1];
        for(int i=n-2;i>=0;i--){
            maxArr[n-1][i]=Math.max(m[n-1][i],maxArr[n-1][i+1]);
            maxArr[i][n-1]=Math.max(m[i][n-1],maxArr[i+1][n-1]);
        }
        for(int i=n-2;i>=0;i--){
            for(int j=n-2;j>=0;j--){
                maxValue=Math.max(maxValue,maxArr[i+1][j+1]-m[i][j]);
                maxArr[i][j]=Math.max(m[i][j],Math.max(maxArr[i][j+1],maxArr[i+1][j]));
            }
        }
        return maxValue;
    }
    public static void main(String[] args){
        int[][] m={{1,2,-1,-4,-20},{-8,-3,4,2,1},{3,8,6,1,3},{-4,-1,1,7,-6},{0,-4,10,-5,1}};
        System.out.println(findMaxValue(m));
    }
}
