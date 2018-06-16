package at.fhj.swd;

import org.junit.Assert;
import org.junit.Test;

import java.util.NoSuchElementException;

import static org.junit.Assert.*;


public class StringQueueTest {

    private StringQueue stringQueue = new StringQueue();

    @Test
    public void testOfferElement() {
        stringQueue.offer("Test1");
        stringQueue.offer("Test2");

        Assert.assertEquals("Test1", stringQueue.element());
    }

    @Test(expected = NoSuchElementException.class)
    public void testElementThrowException() {
        stringQueue.element();
    }

    @Test(expected = NoSuchElementException.class)
    public void testRemoveThrowException() {
        stringQueue.remove();
    }

    @Test
    public void testRemove() {
        stringQueue.offer("Test1");
        stringQueue.offer("Test2");
        stringQueue.remove();

        Assert.assertEquals("Test2", stringQueue.element());
    }

    @Test
    public void testPeekReturnNull() {
        Assert.assertEquals(null, stringQueue.peek());
    }

    @Test
    public void testPeekReturnNotNullWhenPoll() {
        stringQueue.offer("Item1");
        Assert.assertEquals("Item1", stringQueue.peek());
    }

    @Test
    public void testPool() {
        stringQueue.offer("Item1");
        String exp = stringQueue.poll();
        Assert.assertEquals("Item1", exp);
    }
}
