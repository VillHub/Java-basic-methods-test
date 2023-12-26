/*
 *   Created by V.Puusepp, 2023
 */

import definition.DoublyLinkedList;

public class App {
    
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList(); // Loob uue DoublyLinkedList objekti
        System.out.println("app starts with empty list list.printList()");
        list.printList(); 
        // Add element to list
        System.out.println("add elements to the list list.add(1) ,... list.add(4)");
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        System.out.println("print list list.printList()");
        list.printList(); 

        // Remove element from list
        System.out.println("\n" + "remove element  list.remove(3)  ");
        list.remove(3);

        System.out.println("\n" +"print list, list.printList() ");
        list.printList(); 

        System.out.println("\n" +"\n" + "...app end");
        
    }
}
