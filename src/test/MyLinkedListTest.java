import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MyLinkedListTest {

    @Test
    public void testAddItem() {
        MyLinkedList list = new MyLinkedList(new Node("Root"));
        assertTrue(list.addItem(new Node("B")));
        assertTrue(list.addItem(new Node("A")));
        assertTrue(list.addItem(new Node("C")));
        assertFalse(list.addItem(new Node("B"))); // Already present
    }

    @Test
    public void testRemoveItem() {
        MyLinkedList list = new MyLinkedList(new Node("Root"));
        list.addItem(new Node("B"));
        list.addItem(new Node("A"));
        list.addItem(new Node("C"));

        assertTrue(list.removeItem(new Node("B")));
        assertFalse(list.removeItem(new Node("D"))); // Not present
    }
}
