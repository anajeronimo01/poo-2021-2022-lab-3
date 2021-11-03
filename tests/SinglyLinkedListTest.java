import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

public class SinglyLinkedListTest {
    private SinglyLinkedList list;

    @BeforeEach
    public void setUp() {
        list = new SinglyLinkedList();
        list.insertLast(1);
        list.insertLast(2);
        list.insertLast(3);
        list.insertLast(4);
        list.insertLast(5);
    }

    @Test
    public void testInsertFirst() {
        list.insertFirst(0);
        assertEquals(0, list.getFirst());
    }

    @Test
    public void testInsertLast() {
        list.insertLast(99);
        assertEquals(99, list.getLast());
    }

    @Test
    public void testInsert() {
        list.insert(42, 2);
        assertEquals(42, list.get(2));
        assertEquals(2, list.get(1));
        assertEquals(3, list.get(3));
    }

}
