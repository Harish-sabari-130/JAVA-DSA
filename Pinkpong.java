public class Pinkpong {
    public static void main(String[] args) {
        PingPong printer = new PingPong();

        Thread pinkThread = new Thread(() -> printer.printPink());
        Thread pongThread = new Thread(() -> printer.printPong());

        pinkThread.start();
        pongThread.start();
    }

    static class PingPong {
        private boolean pinkPrinted = false;

        public synchronized void printPink() {
            System.out.println("Pink");
            pinkPrinted = true;
            notify(); 
        }

        public synchronized void printPong() {
            try {
                while (!pinkPrinted) {
                    wait(); 
                }
                Thread.sleep(500); 
                System.out.println("Pong");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}