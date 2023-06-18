class MyStack {
    
    Queue<Integer> q1;
    Queue<Integer> q2;
    Queue<Integer> obj;

    public MyStack() {
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
        obj = new LinkedList<>();
        
    }
    public boolean empty() {
        return (q1.isEmpty());
        // if(obj.size()==null){
        //         return true;
        //     } else{
        //         return false;
        //     }
    }
    
    public void push(int x) {
        q2.add(x);
        while (!q1.isEmpty()) {
            q2.add(q1.remove());
        }
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
        
    }
    
    public int pop() {
        if (q1.isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return q1.remove();
        
    }
    
    public int top() {
        if (q1.isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return q1.peek();
        
    }
    
    
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */