package ke.co.stan.leetcode;

import java.security.PublicKey;

public class CoinChange {

    public static void main(String[] args) {
        int amount = 5;
        int[] denominations = new int[]{1, 2, 3};
        System.out.println(recursive(amount, denominations));

    }

    // return number of combinations
    private static int solution(int amount, int[] denominations){
        int[] combinations = new int[amount + 1];
        combinations[0] = 1;

        for(int d: denominations){
            for(int i = 0; i<combinations.length; i++){
                if(i >= d){
                    combinations[i] += combinations[i-d];
                }
            }
        }
        return combinations[amount];
    }

    // return the fewest/minimum number of coins
    public static int coinChange(int amount, int[] coins) {
        if(amount < 0) {
            return -1;
        }
        int[] combinations = new int[amount + 1];
        for(int i = 0; i < amount+1; i++) {
            combinations[i] = amount+1;
        }
        combinations[0] = 0;
        for(int i = 1; i <= amount; i++) {
            for(int coin : coins) {
                if(i-coin < 0){
                    continue;
                }
                combinations[i] = Math.min(combinations[i-coin]+1, combinations[i]);
            }
        }
        return combinations[amount] == amount+1 ? -1 : combinations[amount];

    }

    public static int recursive(int amount, int[] coins){
        int n = coins.length -1;
        // if the total is 0, return 1 (solution found)
        if (amount == 0) {
            return 1;
        }

        // return 0 (solution does not exist) if total becomes negative,
        // no elements are left
        if (amount < 0 || n < 0) {
            return 0;
        }

        // Case 1. Include current coin `S[n]` in solution and recur
        // with remaining change `target-S[n]` with the same number of coins
        int incl = recursive( amount - coins[n], coins);

        // Case 2. Exclude current coin `S[n]` from solution and recur
        // for remaining coins `n-1`
        int excl = recursive(amount, coins);

        // return total ways by including or excluding current coin
        return incl + excl;
    }
}
