package Day3;
import java.util.Arrays;
import java.util.Scanner;
class Dnode
{
    int data;
    Dnode left,right;
    Dnode(int data)
    {
        this.data=data;
        left=right=null;
    }
}
public class DoublyCircularLL
{
   Dnode root,last;    
    void createList()
    {
        root=last=null;
    }
    void insertLeft(int data)
    {
        Dnode n=new Dnode(data);
        if(root==null)
        {
            root=last=n;
            last.right=root;
        }
        else
        {
        	   n.right = root;  
               root.left = n;  
               n.left = last;
               root=n;
               last.right = root; 
          
        }
    }
    void deleteLeft()
    {
        if(root==null)
            System.out.println("DCL Empty list");
        else
        {
            Dnode t=root;
            root=root.right;
            last.right=root;
            root.left=last;
            System.out.println("Deleted:"+t.data);
        }
    }
    
    void insertRight(int data)
            
    {
        Dnode n=new Dnode(data);
        if(root==null)
        {
            root=last=n;
            last.right=root;
        }
        else
        {
        last.right=n;
        n.right=root;
        last=n;
        root.left=last;
        last=n;
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
         Dnode t,t2;
         t=t2=root;
         while(t.right!=null)
         {    t2=t;
             t=t.right;
         }
         last=t2;
         root.left=last;
         last.right=root;
         
         System.out.println("Deleted:"+t.data);
     }
   }

 void printList()
 {
     if(root==null)
              System.out.println("List Empty");
     else
     {
         Dnode t;
         t=root;
         do
         {
             System.out.println(t.data);
             t=t.right;
         }while(t!=root);
     }
   }
  void printRevList()
 {
     if(root==null)
              System.out.println("List Empty");
     else
     {
         Dnode t;
         t=root;
         while(t.right!=root)//stop at last
         {
            t=t.right;
         }
         while(t!=root)//stop when null 
         {
             System.out.println(t.data);
             t=t.left;
         }
        
     }
   }
  
  public static void main(String args[])
  {
      int ch,e=0,x;
      DoublyLinkedListDemo obj=new  DoublyLinkedListDemo();
      Scanner sc=new Scanner(System.in);
      obj. createList();
      do
      {
           System.out.println("1.InsertLeft 2.InsertRight 3.DeleteLeft 4.DeleteRight 5.Print list 6.ReversedList 0.exit");
           ch=sc.nextInt();
           switch(ch)
           {
               case 1:
                   System.out.println("Enter Data:");
                   e=sc.nextInt();
                   obj.insertLeft(e);
                   System.out.println("Inserted Left");
                   break;  
               case 2:
                   System.out.println("Enter Data:");
                   e=sc.nextInt();
                   obj.insertRight(e);
                   System.out.println("Inserted Right");
                   break;
               case 3:
                   obj.deleteLeft();
                   break; 
                case 4:
                    obj.deleteRight();
                    break;
                
                 case 5:
                     obj.printList();
                     break; 
                 case 6:
                     System.out.println(" Reversewd list:");
                     obj.printRevList();
                     break;
                 case 0:
                     System.out.println("Exiting ");
                     break;
                 
                 default:
                      System.out.println("Wrong option selected");
                      break;
           }
      }while(ch!=0);
      }


}