/* CSCI 3343 Analysis of Algorithms Spring 2017
 * Singly Linked List Testing Chapter 3
 * German M. Candelaria
 * 02/07/2017
 */

package ch3_sll;

public class Ch3_SLL {

    public static void main(String[] args) {
        IntSLList myList = new IntSLList();
        //Utilizing newly created 'insert' function to insert a node when there is nothing in the list
        System.out.println("Initial list after inserting '2.:");
        myList.insert(2);
        myList.printAll();
        System.out.println();
        myList.addToTail(3);
        myList.addToTail(5);
        myList.addToTail(15);
        myList.addToTail(30);
        myList.addToTail(45);
        myList.addToTail(50);
        myList.addToTail(70);
        myList.addToTail(80);
        myList.addToTail(90);
        myList.addToTail(100);
        //Displaying initial items
        System.out.println("Initial 10 items in list:");
        myList.printAll();
        System.out.println();
        //Case 1: Utilizing the newly created 'insert' function to insert a node at the beginning of the list
        myList.insert(1);
        //Displaying results
        System.out.println("After inserting '1':");
        myList.printAll();
        System.out.println();
        //Case 2: Utilizing the newly created 'insert' function to insert a node at the middle of the list
        System.out.println("After inserting '25':");
        myList.insert(25);
        //Displaying results
        myList.printAll();
        System.out.println();
        //Case 3:Utilizing the newly created 'insert' function to insert a node at the end of the list
        System.out.println("After inserting '115':");
        myList.insert(115);
        //Displaying results
        myList.printAll();
        System.out.println();       
    }
}
