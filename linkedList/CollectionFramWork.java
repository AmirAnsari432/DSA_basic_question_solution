package linkedList;

import java.util.LinkedList;

public class CollectionFramWork {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.addFirst("is");
        list.add("a");
        list.addFirst("this");
        list.add("list ");
        list.remove(2);

        System.out.println(list);
        System.out.println(list.size());
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " -> ");

        }
        System.out.println();
    }
}
