/*
 * @lc app=leetcode id=204 lang=java
 *
 * [204] Count Primes
 */

// @lc code=start
class Solution {
    public int countPrimes(int n) {
        //我的原始做法, 499979时超时了。。
        // if(n <= 2)
        //     return 0;
        // Set<Integer> prime = new HashSet<Integer>();
        // int count = 1;
        // prime.add(2);
        // for(int i = 3; i < n ; i++) {
        //     boolean flag = true;    //是否为质数
        //     for(int j : prime)
        //         if(i % j == 0) {
        //             flag = false;
        //             break;
        //         }
        //     if(flag) {
        //         prime.add(i);
        //         count++;
        //     }
        // }
        // return count;
        
        //如果是上面的操作，我们在测验每个数时,都要遍历集合并进行运算,在数据非常庞大的情况下这是非常可怕的！！
        //所以这里使用筛选法
        if(n < 3)
            return 0;
        boolean[] notPrime = new boolean[n];
        //既然是质数，首先排除掉所有偶数,因为2也是偶数也是质数,这里用奇数1来顶替2
        int count = n / 2;
        //之后的筛选很耐人寻味: 我们从最小奇数开始,依次乘以每个比他大的奇数，原因有2:
        //1. 奇数相乘后的结果在2-n范围内的数必然是合数,所以筛选出来排除
        //2. 之后的奇数不必再与比他小的奇数相乘来筛选,因为之前已经确认排除
        //最后 i*i < n,因为是当前未经判断的最小奇数,如果大于n,说明我们已排除掉小于n的最小合数(同时是奇数)
        for(int i = 3; i * i < n; i += 2) {
            if(notPrime[i])
                continue;
            //j 就是我们具体要筛掉的数
            for(int j = i * i; j < n; j += i * 2)  //j = i * (i + 2): 3 * 5 * 7
                if(!notPrime[j]){
                    notPrime[j] = true;
                    count--;
                }
        }
        return count;
    }

}
// @lc code=end

