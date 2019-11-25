import java.util.Stack;

class MyQueue {
    private  Stack<Integer> a;
    private  Stack<Integer>b ;

    public MyQueue() {
        a = new Stack<>();
        b = new Stack<>();
    }

    public void push(int x){
        a.push(x);
    }


    public Integer pop() {
        if(b.isEmpty()){
            while(!a.isEmpty()){
                b.push(a.pop());
            }
        }
        return b.pop();
    }

    public Integer peek(){
        if(b.isEmpty()){
            while(!a.isEmpty()){
                b.push(a.pop());
            }
        }
        return b.peek();
    }

    public boolean empty() {
        return a.isEmpty() && b.isEmpty();
    }
}
