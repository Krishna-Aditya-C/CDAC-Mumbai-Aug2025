import java.util.*;
class KthSmallestMatrix{
    static int kthSmallest(int[][] m,int k){
        int n=m.length;
        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->a[0]-b[0]);
        for(int i=0;i<n;i++) pq.add(new int[]{m[i][0],i,0});
        int count=0;
        while(!pq.isEmpty()){
            int[] cur=pq.poll();
            count++;
            if(count==k) return cur[0];
            if(cur[2]+1<n) pq.add(new int[]{m[cur[1]][cur[2]+1],cur[1],cur[2]+1});
        }
        return -1;
    }
    public static void main(String[] args){
        int[][] m={{10,20,30,40},{15,25,35,45},{24,29,37,48},{32,33,39,50}};
        System.out.println(kthSmallest(m,7));
    }
}
