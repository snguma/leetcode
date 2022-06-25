/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ke.co.stan.leetcode;

import java.util.HashSet;

/**
 *
 * @author stane
 */
public class LongestConsecutiveSequence {

    public static void main(String[] args) {

        int N = 7;
        int arr[] = {2, 6, 1, 9, 4, 5, 3};
        System.out.println(findLongestConseqSubseq(arr, N));
    }

    private static int findLongestConseqSubseq(int arr[], int N) {
        // add your code here
        HashSet<Integer> S = new HashSet<Integer>();
        int ans = 0;

        // Hash all the array elements
        for (int i = 0; i < N; ++i) {
            S.add(arr[i]);
        }

        // check each possible sequence from the start
        // then update optimal length
        for (int i = 0; i < N; ++i) {
            // if current element is the starting
            // element of a sequence
            if (!S.contains(arr[i] - 1)) {
                // Then check for next elements
                // in the sequence
                int j = arr[i];
                while (S.contains(j)) {
                    j++;
                }

                // update  optimal length if this
                // length is more
                if (ans < j - arr[i]) {
                    ans = j - arr[i];
                }
            }
        }
        return ans;
    }

}
