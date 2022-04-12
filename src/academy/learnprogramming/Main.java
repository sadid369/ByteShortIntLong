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

        int mayMaxIntText = 2_147_483_647;

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Minimum Value ="+ myMinByteValue);
        System.out.println("Byte Maximum Value ="+ myMaxByteValue);
        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Minimum Value ="+ myMinShortValue);
        System.out.println("Short Maximum Value ="+ myMaxShortValue);
        
        long myLongValue = 100;
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long Minimum Value ="+ myMinLongValue);
        System.out.println("Long Maximum Value ="+ myMaxLongValue);
        long bigLongLiteralvaue = 2_147_483_647_234L;
        System.out.println(bigLongLiteralvaue);

        int myTotal = (myMinIntValue/2);
        byte myNewByteValue =(byte) (myMinByteValue/2);
        short myNewShortValue =(short) (myMinShortValue/2);

    }
}
