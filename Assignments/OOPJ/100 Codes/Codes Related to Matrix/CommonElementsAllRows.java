import java.util.*;
class CommonElementsAllRows{
    static List<Integer> common(int[][] m){
        Map<Integer,Integer> count=new HashMap<>();
        int r=m.length,c=m[0].length;
        for(int j=0;j<c;j++) count.put(m[0][j],1);
        for(int i=1;i<r;i++){
            for(int j=0;j<c;j++){
                if(count.containsKey(m[i][j])&&count.get(m[i][j])==i) count.put(m[i][j],i+1);
            }
        }
        List<Integer> res=new ArrayList<>();
        for(Map.Entry<Integer,Integer> e:count.entrySet()){
            if(e.getValue()==r) res.add(e.getKey());
        }
        return res;
    }
    public static void main(String[] args){
        int[][] m={{1,2,1,4,8},{3,7,8,5,1},{8,7,7,3,1},{8,1,2,7,9}};
        System.out.println(common(m));
    }
}
