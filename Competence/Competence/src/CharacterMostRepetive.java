//program to most repetive chraecter in given string

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;

public class CharacterMostRepetive {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("pleae enter a string");
		String str=sc.nextLine();
		Map<Character, Integer> hash=new LinkedHashMap<Character, Integer>();
	   
		
		for(Character c:str.toCharArray()){
			
			if(hash.containsKey(c)){
				hash.put(c, (hash.get(c)+1));
				
			}
			else{
				hash.put(c,1);
			}
			
		}
		
		Entry<Character, Integer> maxEntry = null;
		for(Entry<Character, Integer> entry:hash.entrySet() ){
			if(maxEntry==null || maxEntry.getValue()<entry.getValue()){
				
				maxEntry=entry;
			}
			
			
			
		}
		
		System.out.println(maxEntry.getKey()+" ---->  "+maxEntry.getValue() );
		
	}

}
