/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ke.co.stan.leetcode;

/**
 *
 * @author stan
 */
public class SearchInsertPosition {

    public static void main(String[] args) {
        int nums[] = {1,3};
        int target = 2;
        int result = SearchInsertPosition.solution(nums, target);
        System.out.println(result);
    }

    public static int solution(int[] nums, int target) {
        for(int i=0; i < nums.length; i++){
            if(nums[i]==target)
                return i;
            else if (nums[i] > target)
                return i;
        }
        return nums.length;
    }
}
