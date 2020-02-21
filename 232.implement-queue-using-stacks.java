/*
 * @lc app=leetcode id=232 lang=java
 *
 * [232] Implement Queue using Stacks
 */

// @lc code=start
class MyQueue {
    //用栈来实现队列一般需要两个栈的操作，这样方便反转元素
    //意如其名: 用input来输入，output来输出
    Stack<Integer> input;
    Stack<Integer> output;
    /** Initialize your data structure here. */
    public MyQueue() {
        input = new Stack();
        output = new Stack();
    }
    /** Push element x to the back of queue. */
    public void push(int x) {
       input.push(x);
    }
    
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        peek();
        return output.pop();
    }
    
    /** Get the front element. */
    public int peek() {
        if(output.isEmpty())
            while(!input.isEmpty())           //这里注意与225题的区别，input的size()一直在变化！！
                output.push(input.pop());
        return output.peek();
    }
    
    /** Returns whether the queue is empty. */
    public boolean empty() {
        return input.isEmpty() && output.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
// @lc code=end

