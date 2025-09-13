import java.util.*;
class SortedOrderMatrix{
    static List<Integer> sortedElements(int[][] m){
        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->a[0]-b[0]);
        int r=m.length,c=m[0].length;
        for(int i=0;i<r;i++) pq.add(new int[]{m[i][0],i,0});
        List<Integer> res=new ArrayList<>();
        while(!pq.isEmpty()){
            int[] cur=pq.poll();
            res.add(cur[0]);
            if(cur[2]+1<c) pq.add(new int[]{m[cur[1]][cur[2]+1],cur[1],cur[2]+1});
        }
        return res;
    }
    public static void main(String[] args){
        int[][] m={{10,20,30,40},{15,25,35,45},{27,29,37,48},{32,33,39,50}};
        System.out.println(sortedElements(m));
    }
}
