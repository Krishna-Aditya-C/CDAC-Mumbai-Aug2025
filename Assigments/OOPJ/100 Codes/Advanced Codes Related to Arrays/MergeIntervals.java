import java.util.*;
class MergeIntervals{
    static int[][] merge(int[][] intervals){
        Arrays.sort(intervals,(x,y)->x[0]-y[0]);
        LinkedList<int[]> r=new LinkedList<>();
        for(int[] in:intervals){
            if(r.isEmpty()||r.getLast()[1]<in[0]) r.add(in);
            else r.getLast()[1]=Math.max(r.getLast()[1],in[1]);
        }
        return r.toArray(new int[0][]);
    }
    public static void main(String[] args){
        int[][] a={{1,3},{2,6},{8,10},{15,18}};
        int[][] r=merge(a);
        for(int[] x:r) System.out.println(x[0]+" "+x[1]);
    }
}