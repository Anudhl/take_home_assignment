package javacollection;

import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class RandomNumbers {

	public static void main(String[] args) {
		
		Random rand = new Random();

	Set<Integer> numb500 = new TreeSet<Integer>();
	
	while(numb500.size()!=500) {
	
		int n = rand.nextInt(900) + 100;
		
		numb500.add(n);
		
	
	}
	
		
	System.out.println(numb500);
	
	System.out.println(numb500.size());
	
	
	System.out.println("Give the nth smallest number which you want");
	
	Scanner userinput = new Scanner(System.in);
	
	int userdata = userinput.nextInt();
	
    Object[] arraynumbers = numb500.toArray();
	
System.out.println(arraynumbers[userdata - 1]);
	
	
	
	
	}

}
