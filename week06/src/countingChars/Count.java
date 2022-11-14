package countingChars;


import java.util.HashMap;
import java.util.Objects;
import java.util.Scanner;

public class Count {
	
	private HashMap<Character, Integer> charCount = new HashMap<>();
	
	
	
	public HashMap<Character,Integer> countCharacters() {
		String word = wordIntake(); //method to assign word value as user input.
		if (word == null || word.isEmpty()) { System.out.println(charCount); }
		
		for (int i = 0; i < word.length(); i++){
			Character charWord = word.charAt(i);
			if (!charCount.containsKey(charWord)) {
				charCount.put(charWord, 1 );
				} else {
					charCount.put(charWord, charCount.get(charWord)+1);
				}	
		}
		return charCount;
	}
	
	public String wordIntake() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the word you would like to break down.");
		String word = scan.nextLine();
		scan.close();
		return word;
	}
	

	public HashMap<Character, Integer> getCharCount() {
		return charCount;
	}

	public void setCharCount(HashMap<Character, Integer> charCount) {
		this.charCount = charCount;
	}

	@Override
	public int hashCode() {
		return Objects.hash(charCount);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Count other = (Count) obj;
		return Objects.equals(charCount, other.charCount);
	}


	@Override
	public String toString() {
		return "Count [charCount=" + charCount + "]";
	}

}
