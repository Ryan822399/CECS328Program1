/*
 * Author: 	   Ryan Hennes
 * Student ID: 014603743
 * Due Date:   September 24th, 2018
 */

import java.util.*;

//Class that contains the sorting method and the main
public class InsertionSort 
{
	//Takes in a singly linked list and uses insertion sort to alphabetize the list based on strings
	public static void sort(linkedList list)
	{
		//for loop through will iterate over every node of the linked list
		for (int j = 1; j < list.getLength(); j++)
		{
			//storing the current node to be compared against the rest of the list
			Node key = (list.getNodeAtIndex(j));
			
			//creating a copy of j in order to iterate backwards through the loop for comparison
			int i = j;
			
			//loops backwards through the list starting at the key value
			//exits when the end of the list is reached OR the correct index of the key is found
			while (i > 0 && (((list.getNodeAtIndex(i-1).getNodeValue()).compareTo(key.getNodeValue()) > 0)))
			{
				//storing the node after the key node to be pointed to later
				Node temp = list.getNodeAtIndex(i).getNextNode();
				
				//this is the main swap to the left of the nodes where the key node now points to the node to the left
				list.getNodeAtIndex(i).setNextNode(list.getNodeAtIndex(i-1));
				
				//When i is 1 we know that whatever the current node is must be set as the head so that the list can be printed properly
				if(i == 1)
				{
					list.setHead(list.getNodeAtIndex(i));
				}
				//otherwise the current node is somewhere in the middle of the list and must have the node to its left be pointing at it 
				else
				{
					list.getNodeAtIndex(i-2).setNextNode(list.getNodeAtIndex(i));
				}
				
				//Finally the key node pointer must point to the next untouched node in the list which was stored at the beginning 
				list.getNodeAtIndex(i).setNextNode(temp);
				
				//decreasing i so that we wll be looking at the next set of nodes 1 to the left until the end of the list is hit
				i--;
			}
		}
	}
	
	//main function that creates the test lists and calls the sorting
	public static void main (String [] Args)
	{
		//initial test case of 20 random names with an output before and after sorting
		linkedList list = new linkedList();	
		list.addToList("carl");		
		list.addToList("bob");		
		list.addToList("ryan");	
		list.addToList("daren");	
		list.addToList("louis");	
		list.addToList("dani");	
		list.addToList("chris");	
		list.addToList("luke");	
		list.addToList("xander");	
		list.addToList("zach");	
		list.addToList("carly");	
		list.addToList("burt");	
		list.addToList("mazen");	
		list.addToList("farhan");	
		list.addToList("hannah");	
		list.addToList("james");	
		list.addToList("christie");	
		list.addToList("julie");	
		list.addToList("scott");	
		list.addToList("timmy");	
		list.addToList("alex");	
		System.out.println("List before sorting:");
		list.print();
		sort(list);
		System.out.println("List after sorting");
		list.print();
		
		//Second test list that shows the sorting of only 2 nodes
		linkedList list2 = new linkedList();	
		list2.addToList("zach");		
		list2.addToList("carl");		
		System.out.println("List2 before sorting:");
		list2.print();
		sort(list2);
		System.out.println("List2 after sorting");
		list2.print();
		
		
		//This is the final test case involving the sorting of only 1 node
		linkedList list3 = new linkedList();	
		list3.addToList("zach");			
		System.out.println("List3 before sorting:");
		list3.print();
		sort(list3);
		System.out.println("List3 after sorting");
		list3.print();	
	}
	
}

//This is the node class I implemented allowing the creation of the singly linked list class
class Node
{
	//Every node will contain a string and a pointer to the next node in the list
	String nodeValue;
	Node nextNode;
	
	//function to return the string value associated with the node
	public String getNodeValue()
	{
		return nodeValue;
	}
	
	//function to return the next node pointed to by the current node
	public Node getNextNode()
	{
		return nextNode;
	}
	
	//Sets the string value of the current node
	public void setNodeValue(String val)
	{
		this.nodeValue = val;
	}
	
	//sets the next node of the current node
	public void setNextNode(Node nextNode)
	{
		this.nextNode = nextNode;
	}
}

//singly linked list class that is used to store all thr string nodes that will be sorted
class linkedList
{
	//every list will always have a head to know the starting node and a tail to know the ending node
	Node head;
	Node tail;
	
	//adds a node with string s to the end of the list
	public void addToList(String s)
	{
		//allocating memory for a new node to be added
		Node tempNode = new Node();
		
		//setting the node value to the string 
		tempNode.setNodeValue(s);
		
		//In this case there is nothing in the list and the new node will be both the head and the tale 
		if (head == null)
		{
			head = tempNode;
			tail = tempNode;
		}
		//otherwise the node will be added to the end of the list where the tail will be updated with the newly added node 
		else
		{
			tail.setNextNode(tempNode);
			tail = tempNode;
		}
	}
	
	//function to se the head node of the list
	public void setHead(Node headNode)
	{
		head = headNode;
	}
	
	//loops through the list using sequential search to find the node at the specified index
	public Node getNodeAtIndex(int index)
	{
		Node tempNode = head;
		
		//loop counter
		int i = 0;
		
		//loop runs as long as there are still nodes in the list
		while (tempNode != null)
		{
			//when the loope counter equals the index we know that we have found the correct node
			if(i == index)
			{
				return tempNode;
			}
			//iterating to the next node in the list as well as iterating the loop counter
			tempNode = tempNode.getNextNode();
			i++;
		}
		//returning the correct node from the passed in index
		return tempNode;
	}
	
	//loops through the list and counts up the length of it
	public int getLength()
	{
		int i = 0;
		Node tempNode = head;
		while (tempNode != null)
		{
			i++;
			tempNode = tempNode.getNextNode();
		}
		return i;
	}
	
	//loops through the list and prints out the values of each node
	public void print()
	{
		Node tempNode = head;
		while (tempNode != null)
		{
			System.out.println(tempNode.getNodeValue());
			tempNode = tempNode.getNextNode();
		}
		System.out.println("");
		
	}
	
}
