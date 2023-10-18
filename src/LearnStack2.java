import java.util.Stack;

public class LearnStack2 {

    public static void main(String[] args) {
    	
    	Stack<String> animals=new Stack<>();
    	
    	animals.push("Lion");
    	animals.push("Cat");
    	animals.push("Horse");
    	animals.push("Dog");
    	System.out.println(animals);
    	System.out.println(animals.pop());//dog because last in first out
        System.out.println(animals);
        System.out.println(animals.peek());
        System.out.println(animals);

    }
}

//peek is used for showing only which value is affected.not effected in list
//push and pop used for add remove