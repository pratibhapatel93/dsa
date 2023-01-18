package Mergsort;

import java.util.Scanner;



class Node
{
	int data;
	Node next;
	public Object root;
	Node(int data)
	{
		this.data=data;
		next=null;
	}
}

public class Mergsort {
	
	Node root;
	void createMergeSortlist()
	{
		root=null;
	}
	 public void insertleft(int data)
	 {
		 Node n=new Node(data);
		 if(root==null)
		 {
			 root=n;
			 
		 }
		 else
		 {
			 n.next=root;
			 root=n;
			 
		 }
		  
	 }

	 
	 public void printlist()
	 {
		 Node t=root;
		 
		 while(t!=null)
		 {
			 System.out.println(t.data);
			 t=t.next;
			 
		 }
	 }

		 public void link(Node aroot,Node broot)
		 {
	Node d=aroot;
		while(aroot.next!=null)
		{
			
			aroot=aroot.next;
		}
		aroot.next=broot;
		
       
		 
		
		 do{
			 System.out.println(aroot.data);
			 aroot=aroot.next;
			 
		 } while(aroot!=null);
	    }


	 public static void main(String args[])
	 {
	     int ch,e=0,x;
	     Mergsort l1=new  Mergsort();
	     Mergsort l2=new  Mergsort();
	     Mergsort l3=new  Mergsort();
	     Scanner sc=new Scanner(System.in);
	     l1. createMergeSortlist();
	     l2. createMergeSortlist();
	     l3. createMergeSortlist();
	
	     			  System.out.println("-----------list1---------");
	                  l1.insertleft(5);
	                  l1.insertleft(1);
	                  l1.insertleft(6);
	                  l1.insertleft(9);//jo nichese ayega vo left
	                  l1.printlist();
	                  System.out.println("-----------list2---------");
	                  l2.insertleft(77);
	                  l2.insertleft(15);
	                  l2.insertleft(12);
	                  l2.insertleft(32);//jo nichese ayega vo left
	                  l2.printlist();
	                  
	                  
	                  System.out.println("-----------88888888888---------");
	                  l3.link(l1.root, l2.root);
	                  l3.printlist();
               
             
        
    }
}
	     