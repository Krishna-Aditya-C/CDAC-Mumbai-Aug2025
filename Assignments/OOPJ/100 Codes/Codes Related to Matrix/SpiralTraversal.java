import java.util.*;
class SpiralTraversal{
    static List<Integer> spiral(int[][] m){
        List<Integer> r=new ArrayList<>();
        int top=0,bottom=m.length-1,left=0,right=m[0].length-1;
        while(top<=bottom&&left<=right){
            for(int i=left;i<=right;i++) r.add(m[top][i]);
            top++;
            for(int i=top;i<=bottom;i++) r.add(m[i][right]);
            right--;
            if(top<=bottom){for(int i=right;i>=left;i--) r.add(m[bottom][i]);bottom--;}
            if(left<=right){for(int i=bottom;i>=top;i--) r.add(m[i][left]);left++;}
        }
        return r;
    }
    public static void main(String[] args){
        int[][] m={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(spiral(m));
    }
}
