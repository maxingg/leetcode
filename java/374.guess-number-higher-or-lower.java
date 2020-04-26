/*
 * @lc app=leetcode id=374 lang=java
 *
 * [374] Guess Number Higher or Lower
 */

// @lc code=start
/* The guess API is defined in the parent class GuessGame.
   @param num, your guess
   @return -1 if my number is lower, 1 if my number is higher, otherwise return 0
      int guess(int num); */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int low = 1, high = n;
        while(low < high) {
            int middle = low + (high - low) / 2;
            if(guess(middle) == 0)
                return middle;
            else if(guess(middle) < 0)
                high = middle - 1;
            else
                low = middle + 1;
        }
        return low;
    }
}
// @lc code=end

