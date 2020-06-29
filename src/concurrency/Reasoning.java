package concurrency;

class Reasoning extends Thread{

    public void distinguish() {
        System.out.println("A Thread is a single action where as a process is executing a program.  There are lots of threads within a process.");
        System.out.println("Start() starts the process where run() doesn't operate on the new thread but the current thread.");
    }
    public void run(){
        distinguish();
        System.out.println("Running Reasoning");
    }
}

