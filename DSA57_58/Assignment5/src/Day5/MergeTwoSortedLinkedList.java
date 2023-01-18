package Day5;

public class MergeTwoSortedLinkedList {
	Node root,t;
	
	 void createLinkedList()
	 {
		 
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
	
	 void addNode(Node node) {
		 if (t == null) {
			t = node;
		}
		else {
			Node temp = t;
			while (temp.next != null) {
			temp = temp.next;
			temp.next = node;
			}
		}
	 }
	 
	 void print() {
		 Node temp = t;
		 while(temp!=null) {
			 System.out.println(temp.data);
			 temp=temp.next;
		 }
	 }
	public static void main(String[] args) {
		
		MergeTwoSortedLinkedList A = new MergeTwoSortedLinkedList();
		 A.addNode(new Node(2));
		 A.addNode(new Node(8));
		 A.addNode(new Node(5));
		 
		 MergeTwoSortedLinkedList B = new MergeTwoSortedLinkedList();
		 B.addNode(new Node(1));
		 B.addNode(new Node(3));

		 A.t = new Merge().MergeSort(A.t, B.t);
		 
		 A.print();
	}
	
}

 class Merge{
	
	Node MergeSort(Node A, Node B) {
		Node dummy = new Node(0);
		Node temp = dummy;
		
		if(A == null) {
			temp.next = B;
		}
		else if(B == null) {
			temp.next = A;
		}
		else {
			while(A!=null && B!=null) {
				if(A.data <= B.data) {
					temp.next=A;
					A=A.next;
				}
				else {
					temp.next = B;
					B=B.next;
				}
				temp=temp.next;
			}
		}
		return dummy.next;
	}
}