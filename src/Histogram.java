import java.util.*;
import java.io.*;
public class Histogram {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Scanner sf = new Scanner(new File("data2.txt"));
		int maxIndx = -1;
		String text[] = new String[1000]; // To be safe, declare more than we need
		while (sf.hasNext()) {
			maxIndx++;
			text[maxIndx] = sf.nextLine();

		}
		
		sf.close();
		System.out.println(text[0]);
		
		String words[] = text[0].split(", ");
		System.out.println(words[1]);
		
		
		
		Map<String, Integer> mappy = new TreeMap<String, Integer>();
		for(String word : words) {
			if(mappy.containsKey(word)) {
				mappy.put(word,mappy.get(word)+1);
			} else {
				mappy.put(word, 1);
			}
		}
		
		Set<String> keys = mappy.keySet();
		Iterator<String> itty = keys.iterator();
		while(itty.hasNext()) {
			String thisKey = itty.next();
			System.out.println(thisKey + ", " + mappy.get(thisKey));
		}
		
		System.out.println();
		
		Map<String, String> mappy2 = new TreeMap<String, String>();
		for(String word : words) {
			if(mappy2.containsKey(word)) {
				mappy2.put(word,mappy2.get(word) + " *");
			} else {
				mappy2.put(word, "*");
			}
		}
		
		Set<String> keys2 = mappy2.keySet();
		Iterator<String> itty2 = keys2.iterator();
		while(itty2.hasNext()) {
			String thisKey = itty2.next();
			System.out.println(thisKey + ", " + mappy2.get(thisKey));
		}

	}
}
