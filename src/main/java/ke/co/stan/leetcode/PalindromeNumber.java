/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ke.co.stan.leetcode;

/**
 *
 * @author stane
 */
public class PalindromeNumber {

    public static void main(String[] args) {
        System.out.println(solution2(42524));
    }

    private static boolean solution(int n) {

        if (n > 0) {
            // convert into arrays
            int[] intArr = String.valueOf(n).chars().map(Character::getNumericValue).toArray();
            String rightNumbers = "";
            String leftNumbers = "";
            if ((intArr.length % 2) == 0) {
                // this is an even number
                // find the numbers on the left
                for (int i = 0; i < intArr.length / 2; i++) {
                    leftNumbers = leftNumbers + String.valueOf(intArr[i]);
                }
                // find the numbers on the right
                for (int i = intArr.length - 1; i >= intArr.length / 2; i--) {
                    rightNumbers = rightNumbers + String.valueOf(intArr[i]);
                }

            } else {

                for (int i = 0; i < intArr.length / 2; i++) {
                    leftNumbers = leftNumbers + String.valueOf(intArr[i]);
                }
                // find the numbers on the right
                for (int i = intArr.length - 1; i > intArr.length / 2; i--) {
                    rightNumbers = rightNumbers + String.valueOf(intArr[i]);
                }
            }
            return rightNumbers.equals(leftNumbers);

        } else if (n == 0) {
            return true;
        }
        return false;
    }

    private static boolean solution2(int x) {
        if ((x < 0) || ((x % 10 == 0) && (x != 0))) {
            return false;
        }
        int copy = x;
        int reversed = 0;
        while (copy != 0) {
            int pop = copy % 10;
            copy /= 10;
            reversed = (reversed * 10) + pop;
        }
        return x == reversed;
    }
}
