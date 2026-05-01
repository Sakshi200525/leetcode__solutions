class MyQueue {
    private Stack<Integer>main;
    private Stack<Integer>helper;

    public MyQueue() {
       main = new Stack<>();
       helper = new Stack<>();
    }
    
    public void push(int x) {
       //add all ele of main to helper
       while(main.size()>0){
        helper.push(main.pop());
       }

       //add to main
       main.push(x);

       //add all ele to from helper to main
       while(helper.size() > 0){
        main.push(helper.pop());
       }
    }
    
    public int pop() {
        return main.pop();
    }
    
    public int peek() {
       return main.peek();
    }
    
    public boolean empty() {
        return main.size()==0;
    }
}


// class MyQueue {
//     Stack<Integer>s1;
//     Stack<Integer>s2;
//     public MyQueue() {
//         s1=new Stack<>();
//         s2=new Stack<>();
//     }
    
//     public void push(int x) {
//         s1.push(x);
//     }
    
//     public int pop() {
//         if(s2.isEmpty()){
//             transfer();
//         }
//         return s2.pop();
//     }
    
//     public int peek() {
//         if(s2.isEmpty()){
//             transfer();
//         }
//         return s2.peek();
//     }
    
//     public boolean empty() {
//         return s1.isEmpty() && s2.isEmpty();
//     }

//     private void transfer(){
//         while(!s1.isEmpty()){
//             s2.push(s1.pop());
//         }
//     }
// }

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 ]
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */