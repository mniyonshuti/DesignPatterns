package with.templatemethod;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReadFromFile {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		//List<String> listOfWords = new ArrayList<>();
		List<Pair> listOfWords = new ArrayList<>();
		String data = "";
		try {
			File myObj = new File("src/textFile.txt");
			Scanner myReader = new Scanner(myObj);
			while (myReader.hasNextLine()) {
				data = data + " " + myReader.next();

			}
			myReader.close();
		} catch (FileNotFoundException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}

		Pattern p = Pattern.compile("[a-zA-Z]+");
		Matcher m1 = p.matcher(data);
		while (m1.find()) {
			//listOfWords.add(m1.group());
			listOfWords.add(new Pair<String, Integer> (m1.group().toLowerCase(),1));
		}
		
//		String str = "";
//		System.out.println(listOfWords);
		//Collections.sort(listOfWords);

		Collections.sort(listOfWords, new PairComparator()
		});
		System.out.println(listOfWords);
//		for(Pair pair : listOfWords) {
//			System.out.println(pair);
//		}
//		Map<String, Integer> hash = new HashMap<>();
//		for (String s : listOfWords) {
//			if (Character.isUpperCase(s.charAt(0))) {
//				str = s.toLowerCase();
//				// System.out.println(str);
//				hash.put(str, 1);
//			} else
//				hash.put(s, 1);
//		}
//
//		TreeMap<String, Integer> tree = new TreeMap<>();
//		tree.putAll(hash);
//		for (Map.Entry<String, Integer> entry : tree.entrySet())
//			System.out.println("(" + entry.getKey() + "," + entry.getValue() + ")");

	}
}
