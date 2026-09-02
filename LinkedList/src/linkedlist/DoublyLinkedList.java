/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package linkedlist;

/**
 *
 * @author Manoj
 */
public class DoublyLinkedList 
{
Node head;

public void insert(int data)
{
Node newnode=new Node(data);

if(head==null)
{
    head=newnode;
}
else
{
    Node temp=head;
    
    while(temp.next!=null)
    {
        temp=temp.next;
    }
    temp.next=newnode;
    newnode.prev=temp;
}
}

public void front()
{
    Node temp=head;
    
    while(temp !=null)
    {
        System.out.print(temp.data+" --> ");
        temp=temp.next;
    }
    
    System.out.print("null");
}
}
