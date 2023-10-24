import java.io.*;
import java.util.*;
import java.io.*;

public class BP_47_HashMap {

	public static void main(String[] args) throws IOException {
		Scanner sf = new Scanner(new File("Data.txt"));
		int maxIndx = -1;
		String text[] = new String[1000]; // To be safe, declare more than we need
		while (sf.hasNext()) {
			maxIndx++;
			text[maxIndx] = sf.nextLine();

		}

		sf.close();

		Map<String, String> codes = new HashMap<String, String>();

		for (int i = 1; i < maxIndx; i++) {
			codes.put(text[i].substring(0, text[i].indexOf("=")), text[i].substring(text[i].indexOf("=") + 1));
		}

		String newSent = text[maxIndx];
		String word[] = newSent.split(" ");

		for (String s : word) {
			if (codes.containsKey(s)) {
				System.out.print(codes.get(s) + " ");
			} else {
				System.out.print(s + " ");
			}
		}
	}

}
