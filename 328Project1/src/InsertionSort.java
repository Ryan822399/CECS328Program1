/*
 * Author: 	   Ryan Hennes
 * Student ID: 014603743
 * Due Date:   September 24th, 2018
 */

import java.util.*;

public class InsertionSort 
{
	
/*
 *     public static int[] doInsertionSort(int[] input){
         
        int temp;
        for (int i = 1; i < input.length; i++) {
            for(int j = i ; j > 0 ; j--){
                if(input[j] < input[j-1]){
                    temp = input[j];
                    input[j] = input[j-1];
                    input[j-1] = temp;
                }
            }
        }
        return input;
    }
 */
	public static void sort(linkedList list)
	{
		Node temp;
		//for (int i = 1; i < )
	}

	
	public static void testPrint(LinkedList<Object> list)
	{
		System.out.println("Before sorting: " + list);
	}
	
	public static void main (String [] Args)
	{
		linkedList list = new linkedList();
		list.addToList("carl");
		list.addToList("ryan");
		list.addToList("bob");
		list.addToList("daren");
		list.addToList("louis");
		list.addToList("dani");
		int i = list.getLength();
		System.out.println(i);
		
		sort(list);
		
		list.print();
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
		if (head == null)
		{
			head = tempNode;
			tail = tempNode;
		}
		else
		{
			tail.setNextNode(tempNode);
			tail = tempNode;
		}
	}
	
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
	
	public void print()
	{
		Node tempNode = head;
		while (tempNode != null)
		{
			System.out.println(tempNode.getNodeValue());
			tempNode = tempNode.getNextNode();
		}
		
	}
	
}
