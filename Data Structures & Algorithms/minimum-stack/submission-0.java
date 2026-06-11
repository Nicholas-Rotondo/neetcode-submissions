class MinStack {

    Stack<Integer> res = new Stack<Integer>();
    

    public MinStack() {
        
    }
    
    public void push(int val) {
        System.out.println("value being pushed" + val);
        res.push(val);
    }
    
    public void pop() {
        System.out.println("value being popped" + res.peek());
        res.pop();
    }
    
    public int top() {
        System.out.println("peeking");
        return res.peek();
    }
    
    public int getMin() {
        if(res.empty()) {
            return 0;
        }
        System.out.println("In getmin");
        Stack<Integer> temp = new Stack<Integer>();
        temp.addAll(res);
        Collections.sort(temp);
        return temp.firstElement();
    }
}
