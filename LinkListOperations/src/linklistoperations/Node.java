/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linklistoperations;

import java.util.HashMap;
import java.util.HashSet;

/**
 *
 * @author Rakesh
 */
public class Node {
    int data;
    Node next;
    
    Node(int data)
    {
        this.data = data;
        this.next = null;
    }
    void append(int data)
    {
        Node end = new Node(data);
        Node node = this;
        while(node.next != null)
        {
            node = node.next;
        }
        node.next = end;
    }
    void Display()
    {
        Node temp = this;
        while(temp != null)
        {
            System.out.println(temp.data);
            temp= temp.next;
        }
    }
    void removeDuplicate()
    {
        Node firstP = this;
        while(firstP.next != null)
        {
            Node secondP = firstP;
            while(secondP.next != null)
            {
               if(secondP.next.data == firstP.data)
               {
                   secondP.next = secondP.next.next;
               }
               else 
                   secondP = secondP.next;
            }
            firstP = firstP.next;
        }
    }
    void removeDuplicateHashMap()
    {
        Node firstP = this;
        HashSet<Integer> hashSet = new HashSet<Integer>();
        Node secondP = null;// = firstP;

        while(firstP != null)
        {
            if(hashSet.contains(firstP.data))
            {
                secondP.next = firstP.next;
            }
            else
            {
                hashSet.add(firstP.data);
                secondP = firstP;
            }
            firstP = firstP.next;
        }
    }
    int  returnLastKthNode(int k)
    {
        Node firstP = this;
        Node secondP = this;
        for(int i = 1; i<k ;i++)
        {
            secondP = secondP.next;
        }
        while(secondP.next != null)
        {
            firstP = firstP.next;
            secondP = secondP.next;
        }
        return firstP.data; 
    }
}
