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

    @Test
    public void testFindParent() {
        list.insert("node 1");
        Node node = list.find("node 1");
        assertEquals(list.head, list.findParent(node.data));
    }

    @Test
    public void testDelete() {
        list.insert("node 1");
        list.delete("node 1");
        assertEquals(list.head.next, null);
        list.insert("node 1");
        list.insert("node 2");
        list.delete("node 2");
        assertEquals(list.find("node 2"), null);
    }

}
