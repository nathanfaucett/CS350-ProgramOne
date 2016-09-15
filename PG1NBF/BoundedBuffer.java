/**
 * BoundedBuffer.java
 *
 * This program implements the bounded buffer using shared memory.
 * Note that this solution is NOT thread-safe. It will be used
 * to illustrate thread safety using Java synchronization in Chapter 7.
 *
 * @author Nathan Faucett
 * @version September 15, 2016
 */

import java.util.*;

public class BoundedBuffer {
    public BoundedBuffer() {
        // buffer is initially empty
        count = 0; in = 0;
        out = 0;

        buffer = new Object[BUFFER_SIZE];
    }

    // producer calls this method
    public void enter(Object item) {
        while (count == BUFFER_SIZE)
        ; // do nothing

        // add an item to the buffer
        ++count;
        buffer[ in ] = item; in = ( in +1) % BUFFER_SIZE;

        if (count == BUFFER_SIZE) {
            System.out.println(" Buffer FULL");
        }
    }

    // consumer calls this method
    public Object remove() {
        Object item;

        while (count == 0); // do nothing

        // remove an item from the buffer
        --count;
        item = buffer[out];
        out = (out + 1) % BUFFER_SIZE;

        if (count == 0) {
            System.out.println(" Buffer EMPTY");
        }

        return item;
    }


    private static final int BUFFER_SIZE = 5;

    private volatile int count;
    private int in ; // points to the next free position in the buffer
    private int out; // points to the next full position in the buffer
    private Object[] buffer;
}
