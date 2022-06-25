/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ke.co.stan.leetcode;

/**
 *
 * @author stane
 */
public class ReverseString {
    public static void main(String[] args) {
        String word = "hello";
        ReverseString.solution(word.toCharArray());
    }
    
    private static void solution(char[] s){
         int begin = 0;
        int end = s.length - 1;
        
        while (begin <= end) {
            char temp = s[begin];
            s[begin] = s[end];
            s[end] = temp;
            
            begin++;
            end--;
        }
    }
}
