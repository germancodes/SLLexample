/* CSCI 3343 Analysis of Algorithms Spring 2017
 * Singly Linked List Chapter 3
 * IntSLLNode.java
 */

package ch3_sll;

class IntSLLNode {
    protected int info;
    protected IntSLLNode next;
    
    public IntSLLNode(int el) {
        info = el;
        next = null;
    }
    public IntSLLNode(int el, IntSLLNode ptr) {
        info = el; 
        next = ptr; 
    }
}
