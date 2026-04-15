package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListProgram {
	public static void main(String[] args) {
		//add(),set(),remove()
	    //size(),contains()
	    //list can convert to array
		//sort
		List<Integer> list7=new ArrayList<>();
		list7.add(5);
		list7.add(2);
		list7.add(1);
		list7.add(4);
		list7.sort(null);
		System.out.println(list7);
		
		//This list perform all operation
/**		List<String> list= new ArrayList<>();
		System.out.println(list.getClass().getName());
		
		//This list can not add, only set means replace
		List<String> list1=Arrays.asList("Monday","Tuesday","Wednesday");
		System.out.println(list1.getClass().getName());
		list1.set(0, "Friday");
		System.out.println(list1.get(0));
		
		//This list can not add, only set means replace
		String arr[]={"apple","banana","Mango"};
		List<String> list2=Arrays.asList(arr);
		System.out.println(list2.getClass().getName());
		list2.set(0, "orange");
		
		//This list is immutable, can not perform any operation
		List<Integer> list3=List.of(1,2,3,4);
		System.out.println(list3.getClass().getName());
		System.out.println(list3);
		//list3.add(); //error
		
		//list2->collection, capacity
		List<String> list4=new ArrayList<>(list2);
		list4.add("potato");
		System.out.println(list4);
		
		List<Integer> list5=new ArrayList<>();
		list5.add(1);
		list5.add(2);
		list5.add(3);
		list5.add(4);
		list5.add(0,0);//add the value shift the index
		list5.set(4, 5);//replace the index
		list5.remove(Integer.valueOf(1));//remove object not index
		Object array[]=list5.toArray();
		System.out.println(list5);
		
		List<Integer> list6=List.of(6,7,8);
		list5.addAll(list6);//add in previous list
		System.out.println(list5);
		
		List<String> fruit=new ArrayList<>();
		fruit.add("apple");
		fruit.add("banana");
		fruit.add("Mango");
		fruit.add("Cherry");
		fruit.add("Corn");
		fruit.remove(0);//remove by index
	    fruit.remove("Corn");//remove by object
	    System.out.println(fruit);
	    
/**		ArrayList<Integer> arrList1=new ArrayList<Integer>(11);
		arrList1.add(1);
		arrList1.add(1);
		arrList1.add(1);
		arrList1.add(1);
		arrList1.add(1);
		arrList1.add(1);
		arrList1.add(1);
		arrList1.add(1);
		arrList1.add(1);
		arrList1.add(1);
		arrList1.add(1);
		arrList1.add(1);
		System.out.println(arrList1.size());
		
/** 	ArrayList<Integer> arrList=new ArrayList<Integer>();
		arrList.add(10);//0
		arrList.add(20);//1
		arrList.add(35);//2
		arrList.add(89);//3
		
		arrList.set(0, 70);
		System.out.println(arrList);
		
		arrList.remove(0);
		System.out.println(arrList.size());
		
		arrList.add(0, 90);
		
		System.out.println(arrList.get(2));
		System.out.println(arrList.size());
		for(int i=0;i<arrList.size();i++) {
			System.out.println(arrList.get(i));
		}
		
		for(int x:arrList) {
			System.out.println(x);
		}
		System.out.println(arrList.contains(35));
		System.out.println(arrList.contains(50)); **/
	}
	

}
