import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

public class SingleListNodeTest {
    private SingleListNode node;

    @BeforeEach
    public void setUp() {
        node = new SingleListNode("Test", null);
    }

    @Test
    public void testGetElement() {
        assertEquals("Test", node.getElement());
    }

    @Test
    public void testSetNext(){
        SingleListNode other = new SingleListNode("other");
        node.setNext(other);
        assertEquals(other, node.getNext());
    }

    @Test
    public void testGetNext() {
        assertNull(node.getNext());
    }
}
