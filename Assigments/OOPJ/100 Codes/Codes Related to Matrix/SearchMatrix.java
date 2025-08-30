class SearchMatrix{
    static boolean search(int[][] m,int x){
        int r=0,c=m[0].length-1;
        while(r<m.length&&c>=0){
            if(m[r][c]==x) return true;
            else if(m[r][c]>x) c--;
            else r++;
        }
        return false;
    }
    public static void main(String[] args){
        int[][] m={{1,3,5},{7,9,11},{13,15,17}};
        System.out.println(search(m,9));
    }
}
