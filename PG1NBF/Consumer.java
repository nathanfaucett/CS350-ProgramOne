/**
 * Consumer.java
 *
 * This is the consumer thread for calculating if numbers pulled
 * from the buffer are prime are not
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
            int sleeptime = (int) (1 + (7 * Math.random()));

            System.out.println("Consumer "+ name +" sleeping for " + sleeptime + " seconds");

            try {
                sleep(sleeptime * 1000);
            } catch (InterruptedException e) {}

            // consume an item from the buffer
            System.out.println("Consumer "+ name +" wants to consume");

            Object tmp = buffer.remove();
            if (tmp != null) {
                value = (int) tmp;

                System.out.println(
                    "Consumer "+ name +" consumed " + value +
                    " and IT IS" + (isPrime(value) ? " " : " NOT ") + "A PRIME!"
                );
            }
        }
    }

    /* checks if a number other than 1 or it x goes into x */
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
