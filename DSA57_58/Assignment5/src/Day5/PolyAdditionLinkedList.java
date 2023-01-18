package Day5;

public class PolyAdditionLinkedList {

    static class Node {
        int coefficient;
        int degree;
        Node next;

        Node(int c, int d) {
            coefficient = c;
            degree = d;
        }
    }

    public static Node add(Node head1, Node head2) {
        Node newHead = new Node(0, 0);
        Node a = head1;
        Node b = head2;
        Node c = newHead;

        while (a != null || b != null) {

            if (a == null) {
                c.next = b;
                break;
            } 
            else if (b == null) {
                c.next = a;
                break;
            }

            else if (a.degree == b.degree) {
                c.next = new Node(a.coefficient + b.coefficient, a.degree);

                a = a.next;
                b = b.next;
            }

            else if (a.degree > b.degree) {
                c.next = new Node(a.coefficient, a.degree);

                a = a.next;
            }

            else if ((a.degree < b.degree)) {
                c.next = new Node(b.coefficient, b.degree);

                b = b.next;
            }

            c = c.next;
        }

        return newHead.next;
    }

    public static void main(String[] args) {

        Node head1 = null;
        Node head2 = null;

        Node tail1 = null;
        Node tail2 = null;

        
        int coeff_of_p1[] = { 5, 3, 1 };
        int degree_of_p1[] = { 4, 2, 0 };
        int len1 = coeff_of_p1.length;

        
        int i = 0;
        while (len1-- > 0) {
            int c = coeff_of_p1[i];
            int d = degree_of_p1[i];

            Node ptr = new Node(c, d);

            if (head1 == null) {
                head1 = ptr;
                tail1 = ptr;
            }

            else {
                tail1.next = ptr;
                tail1 = ptr;
            }

            i++;
        }

        
        int coeff_of_p2[] = { 4, 2, 1 };
        int degree_of_p2[] = { 4, 2, 1 };
        int len2 = coeff_of_p2.length;

        
        i = 0;
        while (len2-- > 0) {
            int c = coeff_of_p2[i];
            int d = degree_of_p2[i];

            Node ptr = new Node(c, d);

            if (head2 == null) {
                head2 = ptr;
                tail2 = ptr;
            }

            else {
                tail2.next = ptr;
                tail2 = ptr;
            }

            i++;
        }

        Node sum = add(head1, head2);
        Node head = sum;

        while (head != null) {
            System.out.print(head.coefficient + "x^" + head.degree);

            if (head.next != null)
                System.out.print(" + ");
            head = head.next;
        }
        System.out.println();
    }
}