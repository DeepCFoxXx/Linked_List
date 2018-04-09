import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestLinkedList {

    LinkedList list;

    @Before
    public void before() {
        list = new LinkedList("head node");
    }

    @Test
    public void testHeadNode() {
        assertEquals("head node", list.head.data);
    }

}
