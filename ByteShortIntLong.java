public class ByteShortIntLong {
    public static void main(String[] args) {
        int myValue = 10000;
        int myMaxIntValue = Integer.MAX_VALUE;
        int myMinIntValue = Integer.MIN_VALUE;
        System.out.printf("Maximum Integer value: %s\n", myMaxIntValue);
        System.out.printf("Minimum Integer value: %s\n", myMinIntValue);
        // Overflow and Underflow
        System.out.printf("Busted Integer value: %s\n", myMaxIntValue+1);
        System.out.printf("Busted Integer value: %s\n", myMinIntValue-1);

        byte myMaxByteValue = Byte.MAX_VALUE;
        byte myMinByteValue = Byte.MIN_VALUE;
        System.out.printf("Byte Maximum value: %s\n", myMaxByteValue);
        System.out.printf("Byte Minimum value: %s\n", myMinByteValue);

        short myMaxShortValue = Short.MAX_VALUE;
        short myMinShortValue = Short.MIN_VALUE;
        System.out.printf("Short Maximum value: %s\n", myMaxShortValue);
        System.out.printf("Short Minimum value: %s\n", myMinShortValue);

        long myMaxLongValue = Long.MAX_VALUE;
        long myMinLongValue = Long.MIN_VALUE;
        System.out.printf("Long Maximum value: %s\n", myMaxLongValue);
        System.out.printf("Long Minimum value: %s\n", myMinLongValue);

        // Casting
        byte myNewByteValue = (byte)(myMinByteValue/2);
    }
}