
package Codelab;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayAndLinked {

    public static void main(String[] args) {

        // 1. ArrayList declaration
        ArrayList<String> tickets = new ArrayList<>();

        // 2. add(element)
        tickets.add("T001");
        tickets.add("T002");
        tickets.add("T003");
        tickets.add("T004");

        System.out.println("=== TRAIN TICKET ARRAYLIST ===");
        System.out.println("Ticket list: " + tickets);

        // 3. get(index)
        System.out.println("First ticket: " + tickets.get(0));

        // 4. add(index, element)
        tickets.add(0, "T000-PRIORITY");
        System.out.println("After adding priority ticket: " + tickets);

        // 5. set(index, element)
        tickets.set(1, "T001-UPDATED");
        System.out.println("After updating T001: " + tickets);

        // 6. remove(element)
        tickets.remove("T002");
        System.out.println("After removing T002: " + tickets);

        // 7. size()
        System.out.println("Number of tickets: " + tickets.size());

        // 8. isEmpty()
        System.out.println("Is the list empty? " + tickets.isEmpty());

        // 9. clear()
        tickets.clear();
        System.out.println("After clear: " + tickets);
        System.out.println("Is the list empty after clear? "
                + tickets.isEmpty());

        // 10. LinkedList declaration
        LinkedList<String> queue = new LinkedList<>();

        // 11. add(element)
        queue.add("GA031");
        queue.add("GA037");
        queue.add("GA042");

        System.out.println("\n=== AIRPLANE TICKET LINKEDLIST QUEUE ===");
        System.out.println("Initial queue: " + queue);

        // 12. addFirst()
        queue.addFirst("GA045-PRIORITY");
        System.out.println("After adding priority ticket at the beginning: "
                + queue);

        // 13. addLast()
        queue.addLast("GA048");
        System.out.println("After adding a ticket at the end: " + queue);

        // 14. getFirst()
        System.out.println("First ticket (HEAD): " + queue.getFirst());

        // 15. getLast()
        System.out.println("Last ticket (TAIL): " + queue.getLast());

        // 16. removeFirst()
        queue.removeFirst();
        System.out.println("After serving the first customer: " + queue);

        // 17. size()
        System.out.println("Number of tickets in queue: " + queue.size());
    }
}
