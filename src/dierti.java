import java.util.LinkedList;
import java.util.Queue;

public class dierti {
    private Queue<Integer> queue;
    public dierti(){

        queue=new LinkedList<>();
    }
    public void push(int x){
        queue.offer(x);
    }
    public Integer pop(){
        int size=queue.size();
        for(int i=0;i<size-1;i++){
            int v=queue.poll();
            queue.offer(v);

        }
        return queue.poll();
    }

    public int top(){
        int size=queue.size();
        for(int i=0;i<size-1;i++){
            int v=queue.poll();
            queue.offer(v);

        }
        int v=queue.poll();
        queue.offer(v);
        return v;
    }
    public boolean empty(){

        return queue.isEmpty();
    }

}
