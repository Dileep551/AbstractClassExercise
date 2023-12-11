import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

public class SearchTreeTest {

    @Test
    public void testAddItem() {
        SearchTree tree = new SearchTree(new Node("root"));
        assertTrue(tree.addItem(new Node("A")));
        assertTrue(tree.addItem(new Node("B")));
        assertFalse(tree.addItem(new Node("A"))); // Duplicate item
    }

    @Test
    public void testRemoveItem() {
        SearchTree tree = new SearchTree(new Node("root"));
        tree.addItem(new Node("A"));
        tree.addItem(new Node("B"));
        assertTrue(tree.removeItem(new Node("A")));
        assertFalse(tree.removeItem(new Node("A"))); // Item not in the tree
    }

    @Test
    public void testTraverse() {


        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        SearchTree tree = new SearchTree(new Node("root"));
        tree.addItem(new Node("A"));
        tree.addItem(new Node("B"));

        tree.traverse(tree.getRoot());

        System.setOut(System.out);

        // Check the content of outContent
        assertEquals("A\nB\nroot\n", outContent.toString());



    }
}
