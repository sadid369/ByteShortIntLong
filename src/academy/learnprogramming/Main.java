package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	int myValue = 10000;
    int myMinIntValue = Integer.MIN_VALUE;
    int myMaxIntValue = Integer.MAX_VALUE;
   System.out.println(" Integer Minimum value = "+myMinIntValue );
   System.out.println(" Integer Maximum value = "+myMaxIntValue );
        System.out.println("Busted MAx Value" +(myMaxIntValue+1));
        System.out.println("Busted Min Value" +(myMinIntValue-1));
    }
}
