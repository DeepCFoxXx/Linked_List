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

    @Test
    public void testInsertNode() {
        list.insert("node 1");
        assertEquals("node 1", list.head.next.data);
    }

    @Test
    public void testFind() {
        assertEquals("head node", list.find("head node").data);
        list.insert("node 1");
        assertEquals("node 1", list.find("node 1").data);
    }

    @Test
    public void testUpdate() {
        list.update("head node", "updated node");
        assertEquals("updated node", list.head.data);
    }

}
