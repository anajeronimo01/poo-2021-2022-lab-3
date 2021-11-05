import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class SingleListNodeTest {
    private SingleListNode node;

    @BeforeEach
    public void setUp() {
       node = new SingleListNode("Test", null);
    }

    @Test
    public void getElement() {
       assertEquals("Test", node.getElement());
    }

    @Test
    public void getNext() {
        assertNull(node.getNext());
    }

    @Test
    public void setNext() {
        SingleListNode newNode = new SingleListNode();
        node.setNext(newNode);
        assertEquals(newNode, node.getNext());
    }
}
