package Lesson4;

import java.util.Stack;

public class Maximum {
    public int maxDepth(String s) {
        Stack<String> stk = new Stack<>();
        int max=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                stk.push("(");
                if(stk.size()>max)
                    max=stk.size();
            }
            else if(s.charAt(i)==')')
                stk.pop();
        }
        return max;
    }
}
