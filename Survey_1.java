package basic_java;

import java.util.HashMap;
import java.util.Map;
import java.util.*;

@FunctionalInterface
interface Example{
	public void display(int i);
}


class Person{
	String name;
	int age;
	String catagory;
	String toothpaste;
//	public Person(String name2, int age2, String catagory2) {
//		// TODO Auto-generated constructor stub
//	}

	public Person(String name,int age,String catagory,String toothpaste)
	{
		this.name=name;
		this.age=age;
		this.catagory=catagory;
		this.toothpaste=toothpaste;
	}
	
	
	
}
public class Survey_1 {

	public static void main(String[] args) {
		
	
		
		int max_used = Integer.MIN_VALUE;
		
		
		Map<String,Integer> mp = new HashMap<>();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the number of persong in society");
		int k=sc.nextInt();
		
		for(int i=0;i<k;i++)
		{
			System.out.println("enter about Information about person ");
			System.out.println("enter the age of person ");
			int age = sc.nextInt();
			sc.nextLine();
			System.out.println("enter the name of person ");
			String name = sc.nextLine();
			System.out.println("enter the catagory of person men/child/women ");
			String catagory = sc.nextLine();
			System.out.println("enter the toothpasee pat/pep/dab");
			String toothpaste = sc.nextLine();
			Person pp = new Person(name,age,catagory,toothpaste);
			
			if(!mp.containsKey(pp.toothpaste))
			mp.put(pp.toothpaste,0);
			
			if(mp.containsKey(pp.toothpaste))
			{
				mp.put(pp.toothpaste,mp.get(pp.toothpaste)+1);
			}
			
			
			
			System.out.println();
		
			
		}
	
		
		int max=Integer.MIN_VALUE;
		String max_used_toothpaste="";
		for(Map.Entry<String, Integer> t : mp.entrySet())
		{
			if(t.getValue()>max)
			{
				max=t.getValue();
				max_used_toothpaste = t.getKey();
			}
		}
		
		System.out.println("Most used toothpaste is : "+max_used_toothpaste);
		
		
		
		
	
	}

}
