import java.util.Stack;

public class FuHaoPiPei {
    public static boolean main(String[] args) {
        Stack<Character> stack=new Stack<>();
        String s = null;
        for(char c:s.toCharArray()){
            switch(c){
                case '(':
                case '[':
                case '{':
                    stack.push(c);
                    break;
                case ')':
                case ']':
                case '}':{
                    if(stack.empty()){
                        return false;
                    }
                    char left=stack.pop();
                    if(!((left=='('&&c==')')||(left=='['||c==']')&&(left=='{'||c=='}')))
                    {
                        return false;
                    }
                }

            }
        }
        if(!stack.empty()) {return false;}

        return false;
    }

}
