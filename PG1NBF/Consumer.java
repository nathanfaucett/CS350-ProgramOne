/**
 * Consumer.java
 *
 * This is the consumer thread for the bounded buffer problem.
 *
 * @author Nathan Faucett
 * @version September 15, 2016
 */

import java.util.*;

public class Consumer extends Thread {
    public Consumer(String n, BoundedBuffer b) {
        buffer = b;
        name = n;
    }

    public void run() {
        int value;

        while (true) {
            int sleeptime = (int)(7 * Math.random()) + 1;

            System.out.println("Consumer "+ name +" sleeping for " + sleeptime + " seconds");

            try {
                sleep(sleeptime * 1000);
            } catch (InterruptedException e) {}

            // consume an item from the buffer
            System.out.println("Consumer "+ name +" wants to consume");

            value = (int) buffer.remove();
            System.out.println(
                "Consumer "+ name +" consumed " + value +
                " and IT IS" + (isPrime(value) ? " " : " NOT ") + "A PRIME"
            );
        }
    }

    private boolean isPrime(int x) {
        for (int i = 2; i < x; i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }

    private BoundedBuffer buffer;
    private String name;
}
