import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LearnArrayList1 {

    public static void main(String[] args) {
    	
    	/*String[] studentsName=new String[30];
    	studentsName[0]="Rakesh";
    	//studentsName[1]...studentsName[28]
        studentsName[29]="Harish";
        studentsName[30]="Raman";
        //we cannot add more than array size; thats why we use arrayList.
        
        */
    	
       /* List<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);

        list.add(4);  // This will add 4 at the end of the List.
        System.out.println(list);

        list.add(1, 50); // This will add 50 at index 1. All the other elements will be shifted to right.
        System.out.println(list);
        
       

        List<Integer> newList = new ArrayList(); // Creating a new List which will be added to original list.
        newList.add(150);
        newList.add(160);

        list.addAll(newList); // This will add all the elements present in newList to list.
        System.out.println(list);
         
        System.out.println(list.get(1));
       */

    	List<Integer> list=new ArrayList<>();
    	list.add(10);
    	list.add(20);
    	list.add(30);
    	list.add(40);
    	list.add(50);
    	list.add(60);
    	list.add(70);
    	list.add(80);

    	System.out.println(list);

    	for(int i=0;i<list.size();i++) {
    		System.out.println("the element is" +list.get(2));
    	}

    	for(Integer element:list) {
    		System.out.println("foreach element is"+element);
    	}
    	Iterator<Integer> it=list.iterator();
    	while(it.hasNext()) {
    		System.out.println("Iterator" +it.next());
    	}
    	
    	list.set(2, 1000);
        System.out.println(list);

       System.out.println(list.contains(20));
       
      
       
        list.remove(1);  // This will remove the element at index 1 i.e 20.
        System.out.println(list);
        
        list.remove(Integer.valueOf(40));
        System.out.println(list);// This will remove 40 from the list


        list.clear(); //This will remove all the elements from the list.
        System.out.println(list);



    }
}
