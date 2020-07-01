package lambda_streams;

import java.util.Arrays;
import java.util.List;

class Numbers {
    static List<Integer> nums = Arrays.asList(10,100,1000,5,50,500,3,30,300,7,70,700,1,10,100,25,250,2500);

    public static void main(String[] args) {
        //Part I :complete the static class methods that have been set up in this Numbers class java file.  Use streams to compute the results wheever possible.
        System.out.println(nums);

        //Part II - refactor all of the class methods to accept lambda expressions. You can put the lambda functions directly inside the method calls, or defined them first, then pass them into the methods. give them the same names as the static methods, but add the word 'lambda' in front of every lambda function:
//
        Calulate LambdaSumVar = (nums) -> {
            int sum = 0;
            for (int i = 0; i < nums.size(); i++) {
                      sum = sum + nums.get(i);
               }
            System.out.println(sum);
            return sum;
        };
        LambdaSumVar.Compute(nums);

        Calulate LambdaMissVar = (nums) -> {
            int sum = 0;
            for (int i = 0; i < nums.size(); i++) {
                sum = sum - nums.get(i);
            }
            System.out.println(sum);
            return sum;
        };
        LambdaMissVar.Compute(nums);

        Calulate LambdaDivideVar = (nums) -> {
            int sum = 0;
            for (int i = 0; i < nums.size(); i++) {
                sum = sum / nums.get(i);
            }
            System.out.println(sum);
            return sum;
        };
        LambdaDivideVar.Compute(nums);

        Calulate LambdaMultiVar = (nums) -> {
            int sum = 0;
            for (int i = 0; i < nums.size(); i++) {
                sum = sum * nums.get(i);
            }
            System.out.println(sum);
            return sum;
        };
        LambdaMultiVar.Compute(nums);

        PickNumber LambdaOddValue = (int i) -> {
            if(nums.get(i) % 2 == 1){
                System.out.println("This is True");
                return true;
            }
            else {
                System.out.println("This is false");
                return false;
            }
        };
        LambdaOddValue.Pick(3);

        PickNumber LambdaEvenValue = (int i) -> {
            if(nums.get(i) % 2 == 1){
                System.out.println("This is false");
                return true;
            }
            else {
                System.out.println("This is true");
                return false;
            }
        };
        LambdaEvenValue.Pick(3);

        PickNumber LambdaPrimeValue = (int i) -> {
            for (int x = 2; x < Math.sqrt(i); x++) {
                if (i % x == 0) {
                    System.out.println("False");
                    return false;
                }
            }
            System.out.println("True");
            return true;
        };
        LambdaPrimeValue.Pick(3);

        Calulate LambdaMaxValue = (nums) -> {
            int max = 0;
            for(int i = 0; i < nums.size(); i++){
                if(nums.get(i) > max){
                    max = nums.get(i);
                }
            }
            System.out.println(max);
            return max;
        };
        LambdaMaxValue.Compute(nums);

        Calulate LambdaMinValue = (nums) -> {
            int min = 0;
            for(int i = 0; i < nums.size(); i++){
                if(nums.get(i) < min){
                    min = nums.get(i);
                }
            }
            System.out.println(min);
            return min;
        };
        LambdaMinValue.Compute(nums);

        Comp LambdaComp = (int i, int j) -> {
            if(nums.get(i) > nums.get(j)){
                System.out.println(1);
                return 1;
            }
            else if(nums.get(j) > nums.get(i)){
                System.out.println(-1);
                return -1;
            }
            else {
                System.out.println(0);
                return 0;
            }
        };
        LambdaComp.Comparing(1,3);

        Work LambdaAppend = (int n) -> {
            nums.add(n);
            System.out.println(n);
            return n;
        };
        LambdaAppend.AddingIn(3);
    }
    interface Work{
        public int AddingIn(int n);
    }
    interface Comp{
        public int Comparing(int i, int j);
    }
    interface Calulate{
        public int Compute(List<Integer> nums);
    }
    interface PickNumber {
        public boolean Pick(int i);
    }
    public void sayHello(){
        System.out.println("Say Hello");
    }
    interface added2{
        public void someMethod();

    }
    static boolean isOdd(int i) {
        if(nums.get(i) % 2 == 1){
            return true;
        }
        else {
            return false;
        }
    }

    static boolean isEven(int i) {
        if(nums.get(i) % 0 == 1){
            return true;
        }
        else {
            return false;
        }
    }

    public static boolean isPrime(int i) {
        for (int x = 2; x < Math.sqrt(i); x++) {
            if (i % x == 0) {
                return false;
            }
        }
        return true;
    }

    static int added() {
        int sum = 0;
        for (int i = 0; i < nums.size(); i++) {
            sum = sum + nums.get(i);
        }
        return sum;
    }


    static int subtracted() {
        int sum = 0;
        for(int i = 0; i < nums.size(); i++){
            sum = sum - nums.get(i);
        }
        return sum;
    }

    static int multipled() {
        int sum = 0;
        for(int i = 0; i < nums.size(); i++){
            sum = sum * nums.get(i);
        }
        return sum;
    }

    static int divided() {
        int sum = 0;
        for(int i = 0; i < nums.size(); i++){
            sum = sum / nums.get(i);
        }
        return sum;
    }

    static int findMax() {
        int max = 0;
        for(int i = 0; i < nums.size(); i++){
            if(nums.get(i) > max){
                max = nums.get(i);
            }
        }
        return max;
    }

    static int findMin() {
        int min = 0;
        for(int i = 0; i < nums.size(); i++){
            if(nums.get(i) < min){
                min = nums.get(i);
            }
        }
        return min;
    }

    static int compare(int i, int j) {
        if(nums.get(i) > nums.get(j)){
            return 1;
        }
        else if(nums.get(j) > nums.get(i)){
            return -1;
        }
        else {
            return 0;
        }
    }

    static int append(int n) {
        nums.add(n);
        return n;
    }

}
