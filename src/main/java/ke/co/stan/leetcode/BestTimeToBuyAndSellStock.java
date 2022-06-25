/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ke.co.stan.leetcode;

/**
 *
 * @author stane
 */
public class BestTimeToBuyAndSellStock {
    
    public static void main(String[] args) {
        
        int[] prices = new int[]{2,4,1};
        System.out.println(BestTimeToBuyAndSellStock.maxProfit(prices));
    }
    
    
    private static int maxProfit(int[] prices) {
        int leastPrice = prices[0];
        int dayToBuy = 0;
        
        for(int i = 0; i < prices.length; i++){
            System.out.println("Day - " + String.valueOf(i) + " : price - "+ String.valueOf(prices[i]));
            if(prices[i] < leastPrice){
                leastPrice = prices[i];
                dayToBuy = i;
            }
        }
        
        System.out.println("Least Price - " + String.valueOf(leastPrice) + " : Day to Buy - " + String.valueOf(dayToBuy));
        
        int mostPrice = prices[dayToBuy];
        int dayToSell = 0;
        for(int i = dayToBuy; i < prices.length; i++){
             System.out.println("Day - " + String.valueOf(i) + " : price - "+ String.valueOf(prices[i]));
            if(prices[i] > mostPrice){
                mostPrice = prices[i];
                dayToSell = i;
            }
        }
        System.out.println("Most Price - " + String.valueOf(leastPrice) + " : Day to Sell - " + String.valueOf(dayToBuy));
        if(mostPrice > leastPrice)
            return mostPrice - leastPrice;
        else
            return 0;
    }
    
}
