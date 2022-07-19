package Demo1;

import java.util.HashMap;
import java.util.Set;

public class EX12A_Count_Repeating_charc_In_String_Using_hashmap 
{
public static void main(String[] args) 
{
	String org="abcaba";
	HashMap<Character, Integer> mp=new HashMap<Character, Integer>();
	
	      //i=0;i<=5
	for(int i=0;i<=org.length()-1;i++)  //0,1,2,3,4,5
	{
		char s1= org.charAt(i);   // i=0,1,2,3,4,5//char=a,b,c,a,b,a
		
		if(mp.containsKey(s1))    // false/false/false/true/true/true
		{
			mp.put(s1, mp.get(s1)+1);   //a,1+1//b,1+1//a,2+1
		}
		
		else
		{
			mp.put(s1, 1);        // a,1/b,1/c,1
		}
	}
	
	
	// Each Word
	Set<Character> allKeys = mp.keySet(); //[a,b,c]// unique keys
	for(Character key:allKeys)
	{
		System.out.println(key+": "+mp.get(key));
	}
	
	System.out.println("Repeating characters");
	// REPEATING characters
	
	for( Character key:allKeys) 
	{
		if(mp.get(key)>1)
		{
			System.out.println(key+": "+mp.get(key));
		}
		}
		
	System.out.println("count of a");
		// count of a
		
		System.out.println("a: "+mp.get('a'));
		
	
	
}
}
