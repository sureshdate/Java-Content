import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class LearnMap7 {

    public static void main(String[] args) {
    	
    	Map<String,Integer> numbers =new TreeMap<>();
    	numbers.put("One", 1);
        numbers.put("Three", 3);
        numbers.put("Four", 4);
    	numbers.put("Five", 5);
    	System.out.println(numbers);
        numbers.remove("Three");//its a case sensetive
        System.out.println(numbers);//sorted in keys alphabeticle order.
        
        if(!numbers.containsKey("Two")) {
        	numbers.put("Two", 2);
        }
        System.out.println(numbers);
        numbers.putIfAbsent("six",6);
        System.out.println(numbers);
      //  System.out.println(numbers.containsValue(3));
        System.out.println(numbers.isEmpty());

        /*for(Map.Entry<String, Integer> e:numbers.entrySet()) {
        	 System.out.println(e);
        	 System.out.println(e.getKey());
        	 System.out.println(e.getValue());
         }*/
        

        for(String key:numbers.keySet()) {
        	System.out.println(key);
        }

        for(Integer value: numbers.values()) {
            System.out.println(value);
       }

    }
}
