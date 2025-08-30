import java.util.*;
class UnionIntersectionSorted{
    static List<Integer> union(int[] a,int[] b){
        List<Integer> r=new ArrayList<>();int i=0,j=0;
        while(i<a.length||j<b.length){
            int x=i<a.length?a[i]:Integer.MAX_VALUE;
            int y=j<b.length?b[j]:Integer.MAX_VALUE;
            if(x==y){if(r.isEmpty()||r.get(r.size()-1)!=x)r.add(x);i++;j++;}
            else if(x<y){if(r.isEmpty()||r.get(r.size()-1)!=x)r.add(x);i++;}
            else{if(r.isEmpty()||r.get(r.size()-1)!=y)r.add(y);j++;}
        }
        return r;
    }
    static List<Integer> inter(int[] a,int[] b){
        List<Integer> r=new ArrayList<>();int i=0,j=0;
        while(i<a.length&&j<b.length){
            if(a[i]==b[j]){if(r.isEmpty()||r.get(r.size()-1)!=a[i])r.add(a[i]);i++;j++;}
            else if(a[i]<b[j])i++;else j++;
        }
        return r;
    }
    public static void main(String[] args){
        int[] a={1,2,2,3,4,5};int[] b={2,2,3,5,6};
        System.out.println(union(a,b));
        System.out.println(inter(a,b));
    }
}