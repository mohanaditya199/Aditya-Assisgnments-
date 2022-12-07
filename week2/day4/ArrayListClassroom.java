package week2.day4;

import java.util.ArrayList;
import java.util.List;

public class ArrayListClassroom {

	public static void main(String[] args) {
		
	List<Integer> values = new ArrayList<Integer>();
	
	values.add(89);
    values.add(45);
    values.add(67);
    values.add(67);
    values.add(76);
    values.add(67);
    values.add(64);
	
	int size = values.size();
	System.out.println(size);
    
    
    Integer integer = values.get(4);
    System.out.println(integer);
    
    
    values.add(5, 89);
    System.out.println(values);
	
    
    boolean contains = values.contains(67);
    
    System.out.println(contains);
    
    
    values.clear();
    
    System.out.println(values);
	
    boolean empty = values.isEmpty();
    System.out.println(empty);
    
	}
	
}
