package concurrency;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

class TeamTC1 implements Runnable {

    String name;

    public TeamTC1(String name){
        this.name = "V8";
    }



    List<String> team = new ArrayList<>();

    String TA = "Epapas";
    String student1 = "Abigail";
    String student2 = "Adam";
    String student3 = "Christian";
    String student4 = "Marcelo";
    String student5 = "Monica";
    String student6 = "Phoenix";
    String student7 = "Devon";
    String student8 = "Jose";
    String student9 = "Julian";
    String student10 = "Micheal";

    public void run(){
        try {
            System.out.println(TA);
            team.add(TA);
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(student1);
        try {
            team.add(student1);
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(student2);
        try {
            team.add(student2);
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(student3);
        try {
            team.add(student3);
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(student4);
        try {
            team.add(student4);
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(student5);
        try {
            team.add(student5);
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(student6);
        try {
            team.add(student5);
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(student7);
        try {
            team.add(student6);
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(student8);
        try {
            team.add(student8);
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(student9);
        try {
            team.add(student9);
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(student10);
        try {
            team.add(student10);
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for(int x = 0; x < team.size(); x++){
            System.out.println(team.get(x));
        }
    }
}