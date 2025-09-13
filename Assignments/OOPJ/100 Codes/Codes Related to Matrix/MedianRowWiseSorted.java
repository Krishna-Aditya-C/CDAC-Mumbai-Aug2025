import java.util.*;
class MedianRowWiseSorted{
    static int median(int[][] m){
        int r=m.length,c=m[0].length;
        int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
        for(int i=0;i<r;i++){min=Math.min(min,m[i][0]);max=Math.max(max,m[i][c-1]);}
        int desired=(r*c+1)/2;
        while(min<max){
            int mid=min+(max-min)/2;
            int place=0;
            for(int i=0;i<r;i++) place+=Arrays.binarySearch(m[i],mid)>=0? 
                Arrays.binarySearch(m[i],mid)+1:Math.abs(Arrays.binarySearch(m[i],mid)+1);
            if(place<desired) min=mid+1; else max=mid;
        }
        return min;
    }
    public static void main(String[] args){
        int[][] m={{1,3,5},{2,6,9},{3,6,9}};
        System.out.println(median(m));
    }
}
