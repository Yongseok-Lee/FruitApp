package com.example.lab4;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Main
{
	public static void main(String[] args)
	{
		// Create an arraylist of user-defined class objects
		List<Fruit> fl = new ArrayList<Fruit>();
		
		Fruit s1 = new Fruit(101, "Apple", 1000);
		fl.add(s1);  // Adding a Fruit class object
		Fruit s2 = new Fruit(102, "Orange", 1500);
		fl.add(s2);  // Adding a Fruit class object
		fl.add(new Fruit(103, "Kiwi", 2000));  // Adding a Fruit class object
		fl.add(new Fruit(104, "Melon", 5000));
		fl.add(new Fruit(105, "Peach", 2500));
		fl.add(new Fruit(106, "Pear", 1500));
		fl.add(new Fruit(107, "Banana", 3000));
		fl.add(new Fruit(108, "Grape", 4000));
		fl.add(new Fruit(109, "Tomato", 2000));
		fl.add(new Fruit(110, "Strawberry", 1000));
		
		// Traverse elements of the arraylist (ordered) 
		System.out.println("Fruit List (ordered by name)");
		Collections.sort(fl, new FruitComparator());
		
		for (Fruit s: fl)
		{
			System.out.println(s.toString());
		}
		
		// Traverse elements of the arraylist (reverse ordered)
		System.out.println("Fruit List (reverse ordered by name)");
		Collections.sort(fl, new FruitComparatorDesc());
		
		for (int i = 0; i < fl.size(); ++i)
		{
			System.out.println(fl.get(i).toString());
		}
	}
}