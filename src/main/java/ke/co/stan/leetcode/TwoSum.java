/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ke.co.stan.leetcode;

import java.util.Arrays;

/**
 *
 * @author @snguma
 * 
 * ======= Problem statement ========
 * 
 * Given an array of integers nums and an integer target, return indices of the 
 * two numbers such that they add up to target.
 * You may assume that each input would have exactly one solution, 
 * and you may not use the same element twice.
 * You can return the answer in any order.
 */
public class TwoSum {
    
    public static void main(String[] args) {
        
        int[] nums = {2,7,5,5,11};
        int target = 9;
        int[] result = TwoSum.twoSum(nums, target);
        System.out.println(Arrays.toString(result));
    }
    
    public static int[] twoSum(int[] nums, int target) {
        int[] retVal = new int[2];
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if(target == nums[i] + nums[j]){
                    return new int[]{i, j};
                }
                
            }
        }
        return retVal;
    }
    
}
