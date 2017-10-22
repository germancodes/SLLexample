/* CSCI 3343 Analysis of Algorithms Spring 2017
 * singly linked list class to store integers Chapter 3
 * IntSLList.java
 */

package ch3_sll;

public class IntSLList {
    protected IntSLLNode head, tail;
    public IntSLList() {
        head = tail = null;
    }
    public boolean isEmpty() {
        return head == null;
    }
    public void addToHead(int el) {
        head = new IntSLLNode(el,head);
        if (tail == null)
            tail = head;
    }
    public void addToTail(int el) {
        if (!isEmpty()) {
            tail.next = new IntSLLNode(el);
            tail = tail.next;
        }
        else head = tail = new IntSLLNode(el);
    }
    public int deleteFromHead() { 	// delete the head and return its info; 
        int el = head.info;
        if (head == tail)    		// if only one node on the list;
             head = tail = null;
        else head = head.next;
        return el;
    }
    public int deleteFromTail() { 	// delete the tail and return its info;
        int el = tail.info;
        if (head == tail)    		// if only one node in the list;
             head = tail = null;
        else {               		// if more than one node in the list,
             IntSLLNode tmp;    	// find the predecessor of tail;
             for (tmp = head; tmp.next != tail; tmp = tmp.next);
             tail = tmp;     		// the predecessor of tail becomes tail;
             tail.next = null;
        }
        return el;
    }    	
    public void delete(int el) {  	// delete the node with an element el;
        if (!isEmpty())
            if (head == tail && el == head.info) // if only one
                 head = tail = null;             // node on the list;
            else if (el == head.info) // if more than one node on the list;
                 head = head.next;    // and el is in the head node;
            else {                    // if more than one node in the list
                 IntSLLNode pred, tmp;   // and el is in a non-head node;
                 for (pred = head, tmp = head.next;  
                      tmp != null && tmp.info != el; 
                      pred = pred.next, tmp = tmp.next);
                 if (tmp != null) {   // if el was found;
                     pred.next = tmp.next;					 
                     if (tmp == tail) // if el is in the last node;
                        tail = pred;
                 }
            }
    }
    //'insert' function by German M. Candelaria
    public void insert(int el) {  	// insert the node with an element el;
        if (!isEmpty()) {   //if list is not empty
            IntSLLNode tmp; //initialize 'tmp' node variable
            if (head.info > el) {   //if current head is larger than 'el'
                this.addToHead(el); //add 'el' to the head of the list
            } else if (tail.info < el) {    //if current tail is smaller than 'el'
                this.addToTail(el); //add 'el' to the tail of the list
            } else { //if 'el' is somewhere in the middle of the list
                for (tmp = head; tmp.next.info < el; tmp = tmp.next){   //iterate through the items in the list  until we find a node which is bigger than 'el'
                    //System.out.println(tmp.info);
                }
                tmp.next = new IntSLLNode(el, tmp.next);    //change the 'tmp' next pointer to a new node that is initialized by 'el' and its previous next pointer
            }
        } else { //if list is empty
            head = tail = new IntSLLNode(el); //simply add 'el' as both head and tail
        }
    } 

	public void printAll() {
        for (IntSLLNode tmp = head; tmp != null; tmp = tmp.next)
            System.out.print(tmp.info + " ");                
    }	
}


