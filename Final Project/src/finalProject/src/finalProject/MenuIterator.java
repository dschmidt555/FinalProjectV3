package finalProject;

import java.util.HashMap;

public class MenuIterator {
	

	HashMap<String, String> a = new HashMap();
	
	public String MenuIteratorMethod(HashMap<String, String> menu) {
		
		for(String i : menu.keySet()) {
			System.out.println(i + ": "+menu.get(i));
			a.put(i, menu.get(i));
		}
		
		return a.toString();

	}



}
