package Day5;

import java.util.Scanner;

class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data=data;
        next=null;
    }
}
public class SortingLinkedListLinear 
{
  Node root;
  
 void createLinkedList()
 {
     root=null;
 }
         

 void deleteLeft()
 {    
     if(root==null)
     {
         System.out.println("List Empty");
     }
     else
     {
         Node t=root;//1
         root=root.next;//2
         System.out.println("Deleted:"+t.data);
     }
     }
 void insertRight(int data)
 {
     Node n=new Node(data);
     if(root==null)
     {
         root=n;
     }
     else
     {
         Node t=root;//1 use t to search right
         while(t.next!=null)//2
         {
             t=t.next;
         }
          t.next=n;//3
     }
   }
 void deleteRight()
 {
     if(root==null)
     {
         System.out.println("List Empty");
     }
     else
     {
         Node t,t2;
         t=t2=root;
         while(t.next!=null)//2
         {
             t2=t;
             t=t.next;
         }
         t2.next=null;//break link
         System.out.println("Deleted:"+t.data);
     }
   }
 void printList()
 {
     if(root==null)
     {
         System.out.println("List Empty");
     }
     else
     {
         Node t;
         t=root;
         while(t!=null)//2
         {
             System.out.println(t.data);
             t=t.next;
         }
         
     }
   }
 void countNodes()
 {
     if(root==null)
     {
         System.out.println("List Empty");
     }
     else
     {
         Node t;
         int c=0;
         t=root;
         while(t!=null)//2
         {
             //System.out.println(t.data);
             t=t.next;
             c++;
         }
          System.out.println("Total nodes in list are:"+c);
     }
 }
  
 void searchList(int key)
 {
     if(root==null)
     {
         System.out.println("List Empty");
     }
     else
     {
         Node t;
         int c=0;
         t=root;
         while(t!=null && t.data!=key)//2
         {
             t=t.next;
             c++;
         }
         if(t!=null)//found 
            System.out.println("Found at "+c+" from root");
         else
             System.out.println("Not Found");
     }
                
}
 void deleteKeybased(int key)
 {
     if(root==null)
     {
         System.out.println("List Empty");
     }
     else
     {
         Node t,t2;
         t=t2=root;
         while(t!=null && t.data!=key)//2
         {
             t2=t;
             t=t.next;
         }
         if(t==null)//not found 
            System.out.println("Not found");
         else//found
         {
             if(t==root)//case 1
             { root=root.next;
             }
           
             else if(t.next==null)//case2 
             {  t2.next=null;
             }
             else//case 3
             {  t2.next=t.next;
             }
             
             System.out.println("Deleted:"+t.data);
         }
     }
 }

     

void sortList() {
	Node current, index;
	int temp;
	if(root == null)
	{
		System.out.println("List is empty");
	}
	else {
    current = root;
    while(current!=null)//2
    {
        index = current.next; //
        while(index!=null)
        {
        	if(current.data>index.data)
        	{
        		temp = current.data;
        		current.data = index.data;
        		index.data = temp;
        	}
        	index= index.next;
        }
        current = current.next;
    }
    current = root;
    while(current!=null) {
		System.out.println(current.data);
		current=current.next;
	}
	}
}

	public static void main(String args[])
	{
	    int ch,e;
	    SortingLinkedListLinear obj=new SortingLinkedListLinear();
	    try (Scanner in=new Scanner(System.in)) {
	    
	    obj.createLinkedList();
	    do
	    {
	        System.out.println("1.Insert\t2.Delete\t3.Print\t4.PrintSorted\t5.Count\t6.Search\t0.Exit"); 
	    	
	         ch=in.nextInt();
	         switch(ch)
	         {
	             case 1:
	            	 System.out.println("Enter Data:");
	                 e=in.nextInt();
	            	 obj.insertRight(e);
	                 break;
	                 
	              case 2:
	            	  System.out.println("Delete\n1.Left\t2.Right\t3.Keybased delete\t4.Exit");
	            	  int d = in.nextInt();
	            	 do 
	            	 {
		            	 switch(d)
		            	 {
		            	 case 1: 
		            		 obj.deleteLeft();
		            		 break;
		            	 case 2:
		            		 obj.deleteRight();
		            		 System.out.println("Enter Data:");
			                 e=in.nextInt();
			             	 obj.insertRight(e);
			             	 break;
		            	 case 3:
		              	   	System.out.println("Enter Data to be deleted:");
		                     e=in.nextInt();
		                     obj.deleteKeybased(e);
		                     break;
		            	 }
	            	 }while(d!=0);
	            	 
	               case 3:
	            	   obj.printList();
	              
	               case 4:
	            	   System.out.println("Sorted List");
	                   obj.sortList();
	                 break; 
	                 
	               case 5:
	            	   obj.countNodes();
	                  
	                   break;
	                   
	               case 6:
	            	   System.out.println("Enter Data to be searched:");
	                   e=in.nextInt();
	                   obj.searchList(e);
	                   break;
	
	               default:
	                      System.out.println("Wrong option selected");
	                      break;
	         }
	    }while(ch!=0);
	    }
    
	}
}















