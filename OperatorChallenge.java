public class OperatorChallenge {
    public static void main(String[] args) {
        double first = 20.00;
        double second = 80.00;
        double total = (first + second)*100.00;
        double remainder = total % 40.00;
        boolean hasRemainder = (remainder != 0) ? true : false;
        if (hasRemainder) {
            System.out.println("Got some remainder");
        } else {
            System.out.println("No remainder");
        }

    }
}
