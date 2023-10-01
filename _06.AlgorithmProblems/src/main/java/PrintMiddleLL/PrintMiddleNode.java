package PrintMiddleLL;

public class PrintMiddleNode {
    public static void main(String[] args) {
        MySinglyLinkedList sll=new MySinglyLinkedList();
        for (int i = 1; i <= 6; i++) {
            sll.add(i);
        }
        printMiddle(sll);
    }

    public static void printMiddle(MySinglyLinkedList sll){

        //create two pointers
        Node singleJump = sll.head;
        Node doubleJump = sll.head;
        //iterate over the linked list
        while (doubleJump !=sll.tail && doubleJump.next!=sll.tail){
            singleJump = singleJump.next;
            doubleJump = doubleJump.next.next;
        }
        // doubleJump is located either on tail or before tail
        if(doubleJump==sll.tail) System.out.println(singleJump.id); //on tail, odd number of nodes
        else System.out.println(singleJump.id +","+ singleJump.next.id); //on tail, even number of nodes



    }
}
/*
• Find the middle of a linked list in one pass. If the list has an even number of
nodes, there would be two middle nodes.
• Note: Assume that you don’t know the size of the list ahead of time
 */