/**
 * Server.java
 *
 * This creates the buffer and the producer and consumer threads.
 *
 * @author Nathan Faucett
 * @version September 15, 2016
 */

public class Server {
    public static void main(String args[]) {
            BoundedBuffer server0 = new BoundedBuffer();
            BoundedBuffer server1 = new BoundedBuffer();

            // now create the producer and consumer threads

            Producer John = new Producer("John", server0);
            Producer Liz = new Producer("Liz", server1);

            Consumer Mary = new Consumer("Mary", server0);
            Consumer Bert = new Consumer("Bert", server1);

            John.start();
            Mary.start();

            Liz.start();
            Bert.start();
        } //main
} //class
