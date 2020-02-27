/*
 * @lc app=leetcode id=190 lang=java
 *
 * [190] Reverse Bits
 */

// @lc code=start
public class Solution {
    // you need treat n as an unsigned value
    //按照十进制整数翻转的做法，我们得到常规处理流程
    // public int reverseBits(int n) {
    //     int result = 0;
    //     for(int i = 0; i < 32; i++) {
    //         result <<= 1;   //既然*2最多32次，那直接将第一次废弃掉(用0处理)
    //         result += n & 1;
    //         n >>= 1;
    //     }
    //     return result;
    // }

    //既然频繁调用，我们可以考虑缓存的实现
    //乍看下无法使用缓存，但我们可以将int类型分解为四个单字节，对于单字节，反转的情况最多16种
    //这样我们可以使用map记录每种反转的情况，将反转单字节的操作封装，之后随用随调，如果没有则进行一次反转并存入map
    //大量的查询后，可能map的get()或频繁调用,我们可以进一步改进为数组
    private final Map<Byte, Integer> cache = new HashMap<Byte, Integer>();
    private int reverseByte(byte b) {
        Integer value = cache.get(b);
        if(value != null)
            return value;
        value = 0;
        for(int i = 0; i < 8; i++) {
            value <<= 1;
            value += (b >>> i) & 1;
        }
        cache.put(b, value);
        return value;
    }

    public int reverseBits(int n) {
        byte[] bytes = new byte[4];
        int result = 0;
        //将n拆分为4个字节存储
        for(int i = 0; i < 4; i++)
            bytes[i] = (byte)((n >>> i * 8) & (0xff));
        for(int i = 0; i < 4; i++) {
            result <<= 8;
            result += reverseByte(bytes[i]);
        }
        return result;
    }
}
// @lc code=end

