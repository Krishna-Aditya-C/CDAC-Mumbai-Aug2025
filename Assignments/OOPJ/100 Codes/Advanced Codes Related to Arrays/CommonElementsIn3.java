import java.util.*;
class CommonElementsIn3{
    static List<Integer> common(int[] a,int[] b,int[] c){
        int i=0,j=0,k=0;List<Integer> r=new ArrayList<>();
        while(i<a.length&&j<b.length&&k<c.length){
            if(a[i]==b[j]&&b[j]==c[k]){if(r.isEmpty()||r.get(r.size()-1)!=a[i])r.add(a[i]);i++;j++;k++;}
            else{
                int m=Math.min(a[i],Math.min(b[j],c[k]));
                if(a[i]==m)i++;else if(b[j]==m)j++;else k++;
            }
        }
        return r;
    }
    public static void main(String[] args){
        int[] a={1,5,10,20,40,80};
        int[] b={6,7,20,80,100};
        int[] c={3,4,15,20,30,70,80,120};
        System.out.println(common(a,b,c));
    }
}