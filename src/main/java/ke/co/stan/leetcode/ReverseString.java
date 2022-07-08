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
        String word = "hello stan";
        System.out.println(ReverseString.solution1(word));
    }
    
    private static String solution(String string){
        char[] s = string.toCharArray();
        int begin = 0;
        int end = s.length - 1;

        while (begin <= end) {
            char temp = s[begin];
            s[begin] = s[end];
            s[end] = temp;
            
            begin++;
            end--;
        }
        return new String(s);
    }

    private static String solution1(String s){
        String[] words = s.split(" ");
        StringBuilder res = new StringBuilder();
        for(String word: words){
            res.append(new StringBuffer(word).reverse()).append(" ");
        }
        return res.toString().trim();
    }
}
