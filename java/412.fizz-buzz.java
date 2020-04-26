/*
 * @lc app=leetcode id=412 lang=java
 *
 * [412] Fizz Buzz
 */

// @lc code=start
class Solution {
    public List<String> fizzBuzz(int n) {
        //这样的解法太多的取余运算了。。。
        // List<String> res = new ArrayList<String>();
        // for(int i = 1; i <= n; i++)
        //     if(i % 3 == 0 && i % 5 == 0)
        //         res.add("FizzBuzz");
        //     else if(i % 3 == 0)
        //         res.add("Fizz");
        //     else if(i % 5 == 0)
        //         res.add("Buzz");
        //     else
        //         res.add(i + "");
        // return res;

        //这里有了一种新思路:思考遍历问题不必死盯着给定的数看
        //可以想办法用使用其它数进行简单处理
        //比如3和5的倍数，比起取模，这里只是简单的递增，相等判断和清零
        List<String> res = new ArrayList();
        for(int i = 1, fizz = 0, buzz = 0; i <= n; i++){
            fizz++;
            buzz++;
            if(fizz == 3 && buzz == 5) {
                res.add("FizzBuzz");
                fizz = 0;
                buzz = 0;
            } else if(fizz == 3) {
                res.add("Fizz");
                fizz = 0;
            } else if(buzz == 5) {
                res.add("Buzz");
                buzz = 0;
            } else
                res.add(String.valueOf(i));
        }
        return res;
    }
}
// @lc code=end

