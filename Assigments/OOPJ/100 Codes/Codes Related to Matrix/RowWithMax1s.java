class RowWithMax1s{
    static int rowWithMax1s(int[][] m){
        int r=0,c=m[0].length-1,res=-1;
        while(r<m.length&&c>=0){
            if(m[r][c]==1){res=r;c--;}else r++;
        }
        return res;
    }
    public static void main(String[] args){
        int[][] m={{0,0,0,1},{0,1,1,1},{1,1,1,1},{0,0,0,0}};
        System.out.println(rowWithMax1s(m));
    }
}
