
//	@11: Write code to Calculate frequency of characters in a string


package java100;

import java.util.HashMap;
import java.util.Map.Entry;

public class occurrencesOfCharacter {

//	public static void main(String[] args) {
//
//		String str1 = "aamiiittmer";
//		char ch[] = str1.toCharArray();
//		for (int i = 0; i < ch.length; i++) {
//			int count = 0;
//			for (int j = 0; j < ch.length; j++) {
//
//				if (j < i && ch[i] == ch[j]) {
//
//					break;
//				}
//				if (ch[i] == ch[j]) {
//					count++;
//				}
//			}
//			if (count != 0) {
//				System.out.println(ch[i] + "---" + count);
//			}
//		}
//
//	}
//
//}

	public static void main(String[] args) {
	
		String strs = "Footable";
		
		String str = strs.toLowerCase();
		
		HashMap <Character, Integer> map = new HashMap <Character, Integer>();
		
		for(char ch : str.toCharArray()) {
			
			if(map.get(ch) == null) {
				map.put(ch, 1);
			}else {
				map.put(ch, map.get(ch)+1);
			}
			
		}
		
//		System.out.println(map);   ye bhi kar sakte h or for loop se bhi nikal sakte h is se map me he sala data aayega
		
		for(Entry<Character, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey()+" -----> "+entry.getValue());
		}
		
	}
}