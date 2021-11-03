import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SingleListNodeTest {
    @Test
    void testGetElement(){
        SingleListNode node = new SingleListNode("Teste", null);
        assertEquals("Teste", node.getElement());
    }
}
