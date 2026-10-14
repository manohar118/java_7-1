public class ThreadClassDemo {
    private static class GoodMorningThread extends Thread {
        @Override
        public void run() {
            while (!isInterrupted()) {
                System.out.println("Good Morning");
                try {
                    Thread.sleep(1_000);
                } catch (InterruptedException e) {
                    interrupt();
                }
            }
        }
    }

    private static class HelloThread extends Thread {
        @Override
        public void run() {
            while (!isInterrupted()) {
                System.out.println("Hello");
                try {
                    Thread.sleep(2_000);
                } catch (InterruptedException e) {
                    interrupt();
                }
            }
        }
    }

    private static class WelcomeThread extends Thread {
        @Override
        public void run() {
            while (!isInterrupted()) {
                System.out.println("Welcome");
                try {
                    Thread.sleep(3_000);
                } catch (InterruptedException e) {
                    interrupt();
                }
            }
        }
    }

    public static void main(String[] args) {
        new GoodMorningThread().start();
        new HelloThread().start();
        new WelcomeThread().start();
    }
}
