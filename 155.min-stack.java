/*
 * @lc app=leetcode id=155 lang=java
 *
 * [155] Min Stack
 */

// @lc code=start
class MinStack {

    /** initialize your data structure here.
     * 这个题的亮点: 1.不破坏栈结构  2.随时锁定最小元素
     * 第一点直接顺序入栈即可
     * 第二点，如果特别用一个变量来记录,那么pop()很危险(栈顶是最小值的话)，所以我们保证多记录一个次小值(可能多次记录)
     */
    Stack<Integer> stack = new Stack<>();
    int min = Integer.MAX_VALUE;

    public void push(int x) {
        if(x <= min) {      //=的情况不能少
            stack.push(min);    //可能是次最小元素
            min = x;
        }
        stack.push(x);
    }
    
    public void pop() {
        if(stack.pop() == min)
            min = stack.pop();  //删除多余的次小值，即当前最小值
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
// @lc code=end

