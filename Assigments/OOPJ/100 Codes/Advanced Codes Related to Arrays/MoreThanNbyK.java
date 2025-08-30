import java.util.*;
class MoreThanNbyK{
    static List<Integer> find(int[] a,int k){
        Map<Integer,Integer> c=new HashMap<>();
        for(int x:a){
            if(c.containsKey(x)) c.put(x,c.get(x)+1);
            else if(c.size()<k-1) c.put(x,1);
            else{
                List<Integer> rm=new ArrayList<>();
                for(Integer y:c.keySet()){int v=c.get(y)-1;if(v==0) rm.add(y); else c.put(y,v);}
                for(Integer y:rm) c.remove(y);
            }
        }
        Map<Integer,Integer> f=new HashMap<>();
        for(int x:a) if(c.containsKey(x)) f.put(x,f.getOrDefault(x,0)+1);
        List<Integer> r=new ArrayList<>();
        for(Integer y:f.keySet()) if(f.get(y)>a.length/k) r.add(y);
        return r;
    }
    public static void main(String[] args){
        int[] a={3,1,2,2,1,2,3,3};
        System.out.println(find(a,4));
    }
}