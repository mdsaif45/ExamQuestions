import java.util.HashSet;
import java.util.Set;


// Minimum deletion operation is required to get
// unique char string

public class MinDeletion {
    public static void main(String[] args) {
        
        String str = "abacbabc";
        
        Set<Character> set = new HashSet<Character>();
        int count=0;

        for(int i=0; i<str.length(); i++){
            char c = str.charAt(i);
            
            // HashMap<Character, Integer> map = new HashMap<>();
            if(!set.contains(c)){
                count += str.length() - str.replace(c+"", "").length() - 1;
                // map.put(c, count);
                // System.out.println(c +" "+count);
                // System.out.println(c+" "+(str.chars().filter(e->e==c).count()-1));
                // System.out.println(c+" "+(str.codePoints().filter(e->e==c).count()-1));
            }
            set.add(c);

        }

        // acheive unique string like
        // string = "abc", "bac", "cba"
        System.out.println(count);
    }
}
