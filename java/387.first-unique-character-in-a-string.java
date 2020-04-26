/*
 * @lc app=leetcode id=387 lang=java
 *
 * [387] First Unique Character in a String
 */

// @lc code=start
class Solution {
    public int firstUniqChar(String s) {
        // if(s.isEmpty())
        //     return -1;
        // //常规方法,两次扫描无疑降低了效率
        int[] chars = new int[26];
        char[] str = s.toCharArray();
        for(int i = 0; i < str.length; i++) 
            chars[str[i] - 'a']++;
        for(int i = 0; i < str.length; i++)
            if(chars[str[i] - 'a'] == 1)
                return i;
        return -1;

        //首先源字符串数组必须扫描一遍,如果扫描时就能确定这个元素是重复元素并删除它,这样扫描后的第一个元素必是不重复元素
        // Map<Character, Integer> map = new LinkedHashMap<>();
        // Set<Character> set = new HashSet<>();
        // for (int i = 0; i < s.length(); i++) {
        //     if (set.contains(s.charAt(i))) {
        //         if (map.get(s.charAt(i)) != null) {
        //             map.remove(s.charAt(i));
        //         }
        //     } else {
        //         map.put(s.charAt(i), i);
        //         set.add(s.charAt(i));
        //     }
        // }
        // return map.size() == 0 ? -1 : map.entrySet().iterator().next().getValue();    
        //entrySet()该方法返回值就是这个map中各个键值对映射关系的集合。
    }
}
// @lc code=end

