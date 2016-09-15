/**
 * Producer.java
 *
 * This is the producer thread for generating random numbers to send
 * to the consumer
 *
 * @author Nathan Faucett
 * @version September 15, 2016
 */

import java.util.*;

public class Producer extends Thread {
    public Producer(String n, BoundedBuffer b) {
        buffer = b;
        name = n;
    }

    public void run() {
        int value;

        while (true) {
            int sleeptime = (int) (1 + (7 * Math.random()));

            System.out.println("Producer "+ name +" sleeping for " + sleeptime + " seconds");

            try {
                sleep(sleeptime * 1000);
            } catch (InterruptedException e) {}

            // produce an item & enter it into the buffer
            value = (int) (4000 + (56000 * Math.random()));
            System.out.println("Producer "+ name +" produced " + value);

            buffer.enter(value);
        }
    }

    private BoundedBuffer buffer;
    private String name;
}
