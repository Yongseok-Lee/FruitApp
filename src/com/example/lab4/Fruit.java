package com.example.lab4;

import java.util.Comparator;

public class Fruit
{
	int no;			// number
	String name;	// name
	int price; 		// price
	
	public Fruit(int no, String name, int price)
	{
		this.no = no;
		this.name = name;
		this.price = price;
	}
	
	public int getNo()
	{
		return this.no;
	}
	
	public void setNo(int no)
	{
		this.no = no;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public int getPrice()
	{
		return this.price;
	}
	
	public void setPrice(int price)
	{
		this.price = price;
	}
	
	public String toString()
	{
		return "Fruit [no = " + this.no + ", name = " + this.name + ", price = " + this.price + "]";
	}
}

class FruitComparator implements Comparator<Fruit>
{
	@Override
	public int compare(Fruit o1, Fruit o2)
	{
		return o1.name.compareTo(o2.name);
	}
}

class FruitComparatorDesc implements Comparator<Fruit>
{
	@Override
	public int compare(Fruit o1, Fruit o2)
	{
		return o2.name.compareTo(o1.name);
	}
}