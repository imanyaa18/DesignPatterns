
class ThreadSafeSingleton {

    private static ThreadSafeSingleton instance;

    private ThreadSafeSingleton() {
        System.out.println("Singleton instance created!");
    }

    public static synchronized ThreadSafeSingleton getInstance() {
        if (instance == null) {
            instance = new ThreadSafeSingleton();
        }
        return instance;
    }
}

public class ThreadSafeSingletonDemo {

    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {

            Thread thread = new Thread(() -> {
                ThreadSafeSingleton obj =
                        ThreadSafeSingleton.getInstance();

                System.out.println(
                        Thread.currentThread().getName()
                                + " got: " + obj
                );
            });

            thread.start();
        }
    }
}
