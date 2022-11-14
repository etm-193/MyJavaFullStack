package recusionAssignment;

public class Main {

		public static void main(String[] args) {
			
			package com.skillstorm;

			import java.util.HashMap;

			public class CountingCharacters {
				
					// Here I will create a HashMap that will take my String word and returned a HashMap with keys and Values.
				
					public static HashMap<Character, Integer> countChar (String input ) {
						
							HashMap<Character, Integer> counter = new HashMap<>();
							
							// If my the input is empty or null by the user will return the HashMap as empty. 
							
								if ( input == null || input.length() == 0 ) {
									return counter;
								}
								
								// I'm going to use a for loop to go through my HashMap and count the letters of the String and return the count of each character.
								
								for ( int i = 0; i < input.length(); i++ ) {
									Character myCounter = input.charAt(i);
									
										if ( myCounter != ' ') {
											if ( counter.containsKey(myCounter)) {
												counter.put(myCounter, counter.get(myCounter) + 1 );
											} else { 
												counter.put(myCounter, 1);
												
											}
										}
								}
						return counter;
						
					}
					
					        public static void main ( String [] args ) {
					        	
					        	// I'm going to print out the largest word in the world to make sure the code works.
					        	
					        	System.out.println(countChar(" The longest word is " ));
					        	System.out.println();
					        	System.out.println(countChar(" Pneumonoultramicroscopicsilicovolcanoconiosis "));
						
					}

			}
			
		}
}
