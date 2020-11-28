import java.util.HashMap;
import java.util.Map;
class P242 {
        public boolean isAnagram(String s, String t) {
            if( s.length() != t.length() )
                return false;
            Map <Integer,Integer> o = new HashMap<>();
            for( int index=0; index<s.length(); index++ ) {
                o.put((int)s.charAt(index), (o.getOrDefault(s.charAt(index), 0)+1));
            }

            for( int index=0;index<t.length();index++) {
                o.put((int)t.charAt(index),(o.getOrDefault(s.charAt(index), 0)-1));
            }

            for( int n:o.values()){
                if(n<0)
                return false;
            }
            return true;
       }
}