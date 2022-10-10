import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;


// Closest Number
public class ClosestNumber {
    public static void main(String[] args) {
        // List<Integer> numbers = List.of(2, 4, 6, 10);
        List<Integer> numbers = List.of(-7, -2, -1, 2, 3, 6);
        
        // Collection.sort(numbers);

        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        int dif = 9999999;
        // finding minimum difference between nubers in list
        for(int i=1; i<numbers.size(); i++){
            int n = Math.abs(numbers.get(i) - numbers.get(i-1));
            if(dif > n){
                dif = n;
            }
        }

        // add minimum difference pair in map
        for(int i=1; i<numbers.size(); i++){
            int n = Math.abs(numbers.get(i) - numbers.get(i-1));
            if(dif == n){
                map.put(numbers.get(i-1), numbers.get(i));
            }
        }
        
        // printing closest number pair
        for(Entry<Integer, Integer> s: map.entrySet()){
            System.out.println(s.getKey()+" "+s.getValue());
        }
        // System.out.println(dif);

    }
}
