package concurrency;

public class Main {
   
    public static void main(String[] args) {
         Reasoning reason = new Reasoning();
         reason.start();
         TeamTC1 tc3 = new TeamTC1("V8");
         Thread t1 = new Thread(tc3);
         t1.start();
    }
}