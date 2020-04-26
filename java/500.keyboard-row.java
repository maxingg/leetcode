/*
 * @lc app=leetcode id=500 lang=java
 *
 * [500] Keyboard Row
 */

// @lc code=start
class Solution {
    //我这里没有想出什么好的办法，采用了两次遍历,不过由于静态代码块，提高了不少效率
    public static String[] strs = {"QWERTYUIOP","ASDFGHJKL","ZXCVBNM"};
    public static Map<Character, Integer> map = new HashMap<>();
    static {
        for(int i = 0; i < strs.length; i++)
            for(char c : strs[i].toCharArray())
                map.put(c, i);
    }
    public String[] findWords(String[] words) {
        List<String> res = new ArrayList<>();
        for(String str : words) {
            if(str.equals(""))
                continue;
            int index = map.get(str.toUpperCase().charAt(0));
            for(char c : str.toUpperCase().toCharArray())
                if(map.get(c) != index){
                    index = -1;
                    break;
                }
            if(index != -1)
                res.add(str);
        }
        return res.toArray(new String[0]);
    }
}
// @lc code=end

