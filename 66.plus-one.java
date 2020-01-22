/*
 * @lc app=leetcode id=66 lang=java
 *
 * [66] Plus One
 */

// @lc code=start
class Solution {
    /**
     * 这是常规的数学思路但对绝大部分数字数组来说不会到进位到考虑高位的情况
     * 从最低位开始考虑+1后的进位情况
     * 及时进行carry重置
     */
    // public int[] plusOne(int[] digits) {
    //     int len = digits.length;
    //     int carry = 1;     //表示进位
    //     for(int i = len - 1; i >= 0; i--) {
    //         digits[i] += carry;
    //         carry = digits[i] / 10;
    //         digits[i] %= 10;
    //     }
    //     if(carry == 1) {
    //         int[] result = new int[len+1];
    //         result[0] = 1;
    //         return result;
    //     }
    //     return digits;
    // }

    /**
     * 处理+1不产生进位或进位少的情况更好
     */
    public int[] plusOne(int[] digits) {
        int len = digits.length;
        for(int i = len-1; i >= 0; i--) {
            if(digits[i] < 9) {
                digits[i] ++;
                return digits;        //优于上面方法之处
            }
            digits[i] = 0;
        }

        //此时digits数组各位一定都是0
        int[] target = new int[len+1];
        target[0] = 1;
        return target;
    }
    
}
// @lc code=end

