import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

public class SingleListNodeTest {
    private SingleListNode node;

    @BeforeEach
    void setUp() {
        node = new SingleListNode("Teste", null);
    }

    @Test
    void testGetElement(){
        assertEquals("Teste", node.getElement());
    }

    @Test
    void testGetNext() {
        assertNull(node.getNext());
    }

    @Test
    void testSetNext() {
        SingleListNode otherNode = new SingleListNode("Other", null);
        node.setNext(otherNode);
        assertEquals(otherNode, node.getNext());
    }
}
