package definition;

/**
 * List implementation.
 */

public class DoublyLinkedList {
  /**
   * Head node of the list.
   */
  Node head;

  /**
   * Constructor for DoublyLinkedList.
   */
  public DoublyLinkedList() {
    this.head = null;
  }

  /**
   * Adds a new node with specified data at the end of the list.
   *
   * @param data The data to be added.
   */
  public void add(int data) {
    Node newNode = new Node(data);
    if (head == null) {
      head = newNode;
    } else {

      Node current = head;
      while (current.next != null) {
        current = current.next;
      }
      current.next = newNode;
      newNode.prev = current;
    }
  }

  /**
   * Removes the first node with the specified data.
   *
   * @param data The data of the node to be removed.
   */
  public void remove(int data) {
    if (head == null) {
      return;
    }

    Node current = head;
    while (current != null) {
      if (current.data == data) {        
        if (current.prev != null) {          
          current.prev.next = current.next;
        } else {
          head = current.next;
        }
        if (current.next != null) {
          current.next.prev = current.prev;
        }
        return;
      }
      current = current.next;
    }
  }

  /**
   * Prints the list data from head to tail.
   */
  public void printList() {
    Node current = head;
    while (current != null) {
      System.out.print(current.data + " ");
      current = current.next;
    }
    System.out.println();
  }

}
