/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ke.co.stan.leetcode;

/**
 *
 * @author stane
 */
public class ReverseInteger {
    
    public static void main(String[] args) {
        int input = 5646457;
        System.out.println(ReverseInteger.solution(input));
    }
    
    private static int solution(int input){
        long result = 0;
        while(input != 0){
            result = (result * 10) + input % 10;
            input = input/10;
        }
		//if we are getting result which is exceeding the integer limit then we'll return 0
        if(result > Integer.MAX_VALUE || result < Integer.MIN_VALUE){
            return 0;
        }
        return (int)result;
    }
}
