import java.util.ArrayList;

public class disanti {
    private ArrayList<Integer>nomal=new ArrayList<>();
    private ArrayList<Integer>min=new ArrayList<>();
    public disanti(){}
    public void push(int x){
        nomal.add(x);
        int m;
        if(min.size()==0){
            m=x;
        }else if( x<=(min.get(min.size()-1))){
            m=x;
        }else{
           m=min.get(min.size()-1);
        }
        min.add(m);

    }
    public void pop(){
        nomal.remove(nomal.size()-1);
        min.remove(min.size()-1);

    }
    public int top(){
        return nomal.get(nomal.size()-1);

    }
    public int getMin(){
        return min.get(min.size()-1);

    }


}
