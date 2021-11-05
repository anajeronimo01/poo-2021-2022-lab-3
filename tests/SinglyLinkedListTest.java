import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class SinglyLinkedListTest {
    private SinglyLinkedList list;

    @BeforeEach
    public void setUp(){
        list = new SinglyLinkedList();
        list.insertLast(1);
        list.insertLast(2);
        list.insertLast(3);
        list.insertLast(4);
        list.insertLast(5);
    }

    @Test
    public void getFirst() {
        assertEquals(1, list.getFirst());
    }
}
