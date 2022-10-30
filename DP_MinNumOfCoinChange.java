import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class DP_MinNumOfCoinChange {

    private static int minNumOfCoinChange(int[] coins, int amount) {
        int max = amount + 1;           /* We use this to fill the dp table with default values */
        int[] dp = new int[amount + 1]; /* This table will store the answer to our sub problems */
        Arrays.fill(dp, max);           /* Initialize the dp table */

      
        dp[0] = 0;

        for(int i = 1; i < dp.length; i++) {                   /* Solve every sub-problem from 1 to amount */
            for (int coin : coins) {                           /* For each coin we are given */
                if (i >= coin) {                               /* If it is less than or equal to the sub problem amount */
                    dp[i] = Math.min(dp[i], dp[i - coin] + 1); /* Try it. See if it gives us a more optimal solution */
                }
            }
        }

        return dp[amount] > amount ? -1 : dp[amount];
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t-- > 0) {
            String[] details = br.readLine().trim().split("\\s+");
            int amount = Integer.parseInt(details[0]);
            int numOfCoins = Integer.parseInt(details[1]);

            String[] input = br.readLine().trim().split("\\s+");
            int[] coins = new int[numOfCoins];
            for(int i = 0; i < input.length; i++) {
                coins[i] = Integer.parseInt(input[i]);
            }
            System.out.println(minNumOfCoinChange(coins, amount));
        }
    }
}