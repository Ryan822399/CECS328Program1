/*
 * Author: 	   Ryan Hennes
 * Student ID: 014603743
 * Due Date:   September 24th, 2018
 */

import java.util.*;

public class InsertionSort 
{
	
	public static LinkedList<Object> initLinkedList()
	{
		//LinkedList<Object> linkedList = new LinkedList<>();
		/*
		linkedList.add("dan");
		linkedList.add("kelly");
		linkedList.add("mat");
		linkedList.add("katie");
		linkedList.add("allen");
		linkedList.add("daniel");
		linkedList.add("farhan");
		linkedList.add("louise");
		linkedList.add("tom");
		linkedList.add("carl");
		linkedList.add("norbert");
		linkedList.add("sally");
		linkedList.add("mazen");
		linkedList.add("hannah");
		linkedList.add("mel");
		linkedList.add("abby");
		linkedList.add("james");
		linkedList.add("carlos");
		linkedList.add("cindy");
		linkedList.add("chris");
		linkedList.add("christie");
		linkedList.add("chester");
		linkedList.add("ralph");
		*/
		
		
		//return linkedList;
		
	}
	
	/*
	public static LinkedList<Object> sort()
	{
		
	}
	*/
	
	public static void testPrint(LinkedList<Object> list)
	{
		System.out.println("Before sorting: " + list);
	}
	
	public static void main (String [] Args)
	{
		LinkedList<Object> list = initLinkedList();
		testPrint(list);
	}
	
}

class Node
{
	String nodeValue;
	Node nextNode;
	
	public String getNodeValue()
	{
		return nodeValue;
	}
	
	public Node getNextNode()
	{
		return nextNode;
	}
	
	public void setNodeValue(String val)
	{
		this.nodeValue = val;
	}
	
	public void setNextNode(Node nextNode)
	{
		this.nextNode = nextNode;
	}
	
	public String toString()
	{
		return "DEBUG VALUE: " + this.nodeValue;
	}	
}

class linkedList
{
	Node head;
	Node tail;
	
	public void addToList(String s)
	{
		Node tempNode = new Node();
		tempNode.setNodeValue(s);
		
		
	}
	
}
