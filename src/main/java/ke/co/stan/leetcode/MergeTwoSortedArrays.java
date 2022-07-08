package ke.co.stan.leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MergeTwoSortedArrays {

    public static void main(String[] args) {
        int[] a = {1, 3, 5, 7}, b = {2, 4, 6, 8};
        mergeArrays(a,b);

    }

    //Time Complexity: O( nlog(n) + mlog(m) )
    //Auxiliary Space: O(N)
    private static void mergeArrays(int[] a, int[] b){
        Map<Integer, Boolean> map = new HashMap<>();
        for (int i: a){
            map.put(i, true);
        }
        for(int j: b){
            map.put(j, true);
        }
        for(Map.Entry<Integer, Boolean> m : map.entrySet()){
            System.out.println(m.getKey());
        }
    }
}
