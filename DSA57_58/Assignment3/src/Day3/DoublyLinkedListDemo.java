package Day3;
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
public class DoublyLinkedListDemo
{
   Dnode root;    
    void createList()
    {
        root=null;
    }
    void insertLeft(int data)
    {
        Dnode n=new Dnode(data);
        if(root==null)
            root=n;
        else
        {
            n.right=root;//1
            root.left=n;//2
            root=n;//3
        }
    }
    void deleteLeft()
    {
        if(root==null)
            System.out.println("Empty list");
        else
        {
            Dnode t=root;//1
            root=root.right;//2
            root.left=null;//3
            System.out.println("Deleted:"+t.data);
        }
    }
    
    void insertRight(int data)
            
    {
        Dnode n=new Dnode(data);
        if(root==null)
            root=n;
        else
        {
            Dnode t=root;//1
            while(t.right!=null)//2
                t=t.right;
            t.right=n;//3
            n.left=t;//4
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
         while(t.right!=null)//2
         {
             t=t.right;
         }
         t2=t.left;
         t2.right=null;//break link     (t.left).right=null
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
         while(t!=null)//2
         {
             System.out.println(t.data);
             t=t.right;
         }
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
         while(t.right!=null)//stop at last
         {
            t=t.right;
         }
         while(t!=null)//stop when null 
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
           System.out.println("1.InsertLeft 2.InsertRight 3.DeleteLeft .DeleteRight 5.Print list 6.ReversedList 0.exit");
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