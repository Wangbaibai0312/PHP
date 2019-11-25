public class Huan {
    private int[] array;
    private int size=0;
    private int front=0;
    private int rear=0;
    public Huan(int x){
        array=new int[x];
    }
    public boolean enQuene(int value){
        if(size==array.length){
            return false;
        }
        array[rear]=value;
        rear=(rear+1)%array.length;
        size++;
        return true;
    }
    public boolean deQuene(){
        if(size==0){
            return false;
        }
        front=(front+1)%array.length;
        size--;
        return true;

    }
    public int Rear(){
        if(size==0){
            return -1;
        }
        int index=(rear-1+array.length)%array.length;
        return array[index];
    }
    public int  Front(){
        if(size==0){
            return -1;
        }
        return array[front];
    }
    public boolean isEmpty(){
        return size==0;
    }
    public boolean isFull(){
        return size==array.length;
    }

}
