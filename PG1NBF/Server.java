/**
 * Server.java
 *
 * This creates the buffer and the producer and consumer threads
 * and starts them
 *
 * @author Nathan Faucett
 * @version September 15, 2016
 */

public class Server {
    public static void main(String args[]) {
            BoundedBuffer server0 = new BoundedBuffer();
            BoundedBuffer server1 = new BoundedBuffer();

            // now create the producer and consumer threads

            Producer producer0 = new Producer("John", server0);
            Producer producer1 = new Producer("Liz", server1);

            Consumer consumer0 = new Consumer("Mary", server0);
            Consumer consumer1 = new Consumer("Bert", server1);

            producer0.start();
            producer1.start();

            consumer0.start();
            consumer1.start();
        } //main
} //class
