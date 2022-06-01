import java.util.ArrayList;
import java.util.List;

public class t92_collectionframework_list {
	
	

	public static void main(String[] args) {
		List list=new ArrayList();
		list.add(10);
		list.add(20);
		list.add(130);
		list.add(10);
//		list.add("SAM");
//		list.add("tom");
//		list.add('A');
		System.out.println(list);
		list.remove(130);
		System.out.println(list);
//		List list1=new ArrayList();
//		list1.add(20);
//		list1.add(200);
//		list1.add(2001);
//		list1.add(202);
//		System.out.println(list1);
	}

}
