@@ -0,0 +1,150 @@
package Homework6;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class anagram_hw {

	public static String[] anagram_comparator (String[] list) {
		//an array to hold the words containing sorted characters
		String[] sorted_charrs = new String[list.length];
		
		//sorting the character of all the words in the array
		for(int i = 0; i < list.length; i++) {
			sorted_charrs[i] = sort(list[i]);
		}
		
		//sorting the array of characters, so that all anagrams are adjacent
		Arrays.sort(sorted_charrs);
		
		//determining the most frequently occurring anagram
		String final_anagram = highest_frequency(sorted_charrs);

		//gathering all the words which match the anagram into an ArrayList
		List<String> final_list = new ArrayList<String>();
		for(int v = 0; v < list.length; v++) {
			if(final_anagram.equals(sort(list[v]))) {
				final_list.add(list[v]);
			}
		}
		
		//changing the ArrayList to an array
		return toArray(final_list);
	}
	
	//a method which turns an ArrayList into an Array of String objects
	public static String[] toArray(List<String> list) {
		//the built in method returns standard objects
		Object[] object_array =  list.toArray();
		String[] str_arr = new String[object_array.length];
		//this loop cast each object to a String
		for(int p = 0; p < object_array.length; p++) {
			str_arr[p] = (String) object_array[p];
		}
		return str_arr;
	}
	
	//a method which sorts the characters of a string
	public static String sort(String word) {
		//putting the characters of the word into an array
		char[] letters = word.toCharArray();
		//sorting the characters
		Arrays.sort(letters);
		return new String(letters);
	}
	
	//determining the highest frequency anagram in the list
	public static String highest_frequency(String[] list) {
		//an array of unique anagrams which can be used to create separate lists
		ArrayList<String> unique = new ArrayList<>();
		//this while loop checks to see if each word is in the unique list and if not, it adds it
		int j = 0;
		while(j < list.length) {
			if(!contains(unique, list[j])) {
				unique.add(list[j]);				
			}
			j++;
		}
		int[] sizes = new int[unique.size()];
		for(int z = 0; z < unique.size(); z++) {
			sizes[z] = findAll(unique.get(z), list).size();		
		}
		//finding the largest array
		int largest = max(sizes);
		int index = 0;
		//determining the index of the max in the array
		for(int f = 0; f < sizes.length; f++) {
			if(sizes[f] == largest) {
				index = f;
			}
		}
		return unique.get(index);
	} 
	
	//checks to see in a string object is contained in an array of strings objects
	public static boolean contains(ArrayList<String> unique, String word) {
		for(int i = 0; i < unique.size(); i++) {
			if(unique.get(i).equals(word)) {
				return true;
			}
		}
		return false;
	}
	
	//this method uses the unique anagram to find all matching ones and pull them into an ArrayList
	public static ArrayList<String> findAll(String word, String[] list) {
		ArrayList<String> anagrams = new ArrayList<String>();
		for(int i = 0; i < list.length; i++) {
			if(list[i].equals(word)) {
				anagrams.add(list[i]);
			}
		}
		return anagrams;
	}
	//a method which finds the max number in an array of integers
	public static int max(int[] list) {
		int currMax = list[0];
		for(int i = 0; i < list.length; i++) {
			if(list[i] > currMax) {
				currMax=list[i];
			}
		}
		return currMax;
	}
	//a method to print string arrays
	public static void print(String[] list) {
		System.out.print("The list of the most frequent anagrams: ");
		for(int y = 0; y < list.length - 1; y++) {
			System.out.print(list[y] + ", ");
		}
		System.out.println(list[list.length-1]);
	}
	
	public static void main(String[] args) throws FileNotFoundException {
		//test1
		//the input array
		String[] list = {"stale", "least", "less", "dress", "steal", "stela", "tales", "bells", "fuego"};
		
		//finding the most frequent anagrams
		String[] anagram_list = anagram_comparator(list);
		print(anagram_list);
		
		//test2
		//input file
		Scanner s = new Scanner(new FileReader("linuxwords.txt"));
		String[] list2 = new String[45402];
		int d = 0;
		while(s.hasNext()) {
			list2[d] = s.nextLine();
			d++;
		}
		String[] anagram_list2 = anagram_comparator(list2);
		print(anagram_list2);
		s.close();
	
		}
}