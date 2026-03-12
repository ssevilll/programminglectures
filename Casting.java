public class Casting {
    public static void main(String[] args) {
        long longVal = 25;
        short shortVal = (short) longVal; // nothing is lost – 25 is in short range
        System.out.println(shortVal); // Output: 25

        long longVal1 = 111222333444L;
        short shortVal1 = (short) longVal1; // left bits are lost
        System.out.println("shortVal1: " + shortVal1); // (8196) Output will be a seemingly random number due to overflow, as the value exceeds the range of short (-32768 to 32767)

        long longVal2 = -3434646;
        short shortVal2 = (short) longVal2; // left bits are lost //see the sign bit
        System.out.println("shortVal2: " + shortVal2); // (-26774) Output will be a seemingly random number due to overflow, as the value exceeds the range of short (-32768 to 32767)
    }
}
