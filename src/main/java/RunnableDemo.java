public class RunnableDemo {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("inside runnable using anonymous inner class");
            }

        }).start();

        // same as above can be implemented with a lambda expression, with less code
        new Thread(() -> System.out.println("inside Thread constructor using lambda expression")).start();

        // assign a lambda to a variable
        Runnable r = () -> System.out.println("lambda epxression from a var");
        new Thread(r).start();
    }
}
