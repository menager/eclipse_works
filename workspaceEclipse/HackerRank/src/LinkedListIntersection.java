import java.util.*;

public class LinkedListIntersection {
	public static void main(String args[]){
		
		LinkedList<Integer> linkedlist = new LinkedList<Integer>();
		linkedlist.add(4);
		linkedlist.add(11);
		linkedlist.add(42);
		linkedlist.add(65);
		linkedlist.add(44);
		
		LinkedList<Integer> linkedlist2 = new LinkedList<Integer>();
		linkedlist2.add(7);
		linkedlist2.add(12);
		linkedlist2.add(42);
		linkedlist2.add(75);
		linkedlist2.add(84);
		
		System.out.print(intersect(linkedlist, linkedlist2));
		
	}
	
	public static Object intersect(LinkedList list1, LinkedList list2){
		
		Map<Object, Boolean> map = new HashMap<Object, Boolean>();
		Object intersect = null;
		for(int i = 0; i < list1.size()-1; i++){
			map.put(list1.get(i), true);
		}
		
		for(int i = 0; i < list2.size()-1; i++){
			if(map.containsKey(list2.get(i))){
				intersect = list2.get(i);
			}
		}
		return intersect;
	}
}
