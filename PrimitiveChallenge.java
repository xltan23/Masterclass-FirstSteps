public class PrimitiveChallenge {
    public static void main(String[] args) {
        byte byteValue = 127;
        short shortValue = 32000;
        int intValue = 6899;
        long longValue = 50000L+10L*(byteValue+shortValue+intValue);
        System.out.printf("The long value:" + longValue);
    }
    
}
