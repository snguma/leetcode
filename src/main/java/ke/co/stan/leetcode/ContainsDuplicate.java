/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ke.co.stan.leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author stane
 */
public class ContainsDuplicate {
    
    public static void main(String[] args){
        int[] nums = {2,14,18,22,42};
        System.out.println(ContainsDuplicate.solution(nums));
    }
    
    private static boolean containsDuplicate(int[] nums){
        // loop through the array,
        // order the array from smallest to biggest
        // check if index value is same as next
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        for(int i = 0; i<nums.length; i++){
            System.out.println("i  = " + String.valueOf(i) + " | Value = " + String.valueOf(nums[i]) );
            if(nums[i]==nums[i+1]){
                    return true;
                }
        }
        return false;
    }
    
    private static boolean solution(int[] nums){
        //most optimal
        Integer num[] = Arrays.stream( nums ).boxed().toArray( Integer[]::new );
        Set<Integer> myset = new HashSet<> (Arrays.asList(num));
        return (num.length!=myset.size());
    }
    
    private static boolean moreOptimal(int[] nums){
        Set<Integer> set = new HashSet<>();
        for (int num: nums){
            if (!set.add(num)){
                return true;
            }
        }
        return false;
    }
    
}
