import java.util.Deque;
import java.util.ArrayDeque;
class P20 {
    public boolean isValid(String s) {
    Deque <Character> stack = new ArrayDeque<Character>();
    for( int i=0; i<s.length(); i++ ) {
        char ch = s.charAt(i);
        if( ch=='{' || ch=='(' || ch== '[' )
        stack.push(ch);
        else {
            if( ch=='}' && stack.peek()!='{' )
                return false;
            if( ch==')' && stack.peek()!='(' )
                return false;
            if( ch==']' && stack.peek()!='[' )
                return false;
            stack.pop();
        }
    }
    return stack.isEmpty()? true:false;

    }
}