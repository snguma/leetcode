/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ke.co.stan.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;

/**
 *
 * @author stane
 */
public class SingleNumber {
    
    public static void main(String[] args) {
       int nums[] = {2,2,3,3,1,1,8, 8, 7};
       System.out.println(SingleNumber.hashSolution(nums));
    }
    
    private static int solution(int[] nums){
        int res = nums[0];
        for(int i = 1; i < nums.length; i++){
            res = res ^ nums[i];
        }
        return res;
    }
    
    private static int hashSolution(int[] nums){
        HashMap<Integer, Integer> checks = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int counter = (checks.get(nums[i])==null)?0:checks.get(nums[i]);
            counter = counter + 1;
            checks.put(nums[i], counter);
        }
        int retVal = -1;
        for(int key: checks.keySet()){
            if(checks.get(key).equals(1)){
                retVal = key;
            }
        }
        
        return retVal;
            
    }
    
}
