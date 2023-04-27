public class Main extends Thread {
    public static int counter = 0;
    public static void main(String[] args) {
        Main thread = new Main();
        thread.start();
        // Wait for the thread to finish
        while (thread.isAlive()){
            System.out.println("Waiting...");
        }
        System.out.println("This code is outside the thread Nr: " + counter);
        counter++;
        System.out.println("This code is outside the thread Nr: " + counter);
    }
    public void run(){
        counter ++;
        System.out.println("This code is running in a thread Nr: " + counter);
    }

}