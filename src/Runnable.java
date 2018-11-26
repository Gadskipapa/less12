public interface Runnable {
    void jump();
    void run();
    void runfast();
    static void runslow(){
        System.out.println("slow");
    }

    String speed = "100"; // по умолчанию прописывается public static final

    default void notRun() {
        System.out.println("not run");
    }
}
