import java.util.*;
class P412 {
    public List<String> fizzBuzz(int n) {
        ArrayList<String> list = new ArrayList<>();
        for( int pointer=1; pointer<=n; pointer++ ) {
            String t = "";
            if(pointer%3==0)
            t = "Fizz";
            if(pointer%5==0)
            { t += "Buzz"; }
            if( pointer%3!=0 && pointer%5!=0 )
            { t = ""+pointer; }
            list.add(t);
        }
    return list;
    }
}