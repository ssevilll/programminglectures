public class Operators {
    public static void main(String[] args) {
        // bitwise shift operators
        int c = 8; // In binary: 1000

        System.out.println("c << 1 = " + (c << 1)); // Left shift: 1000 << 1 = 10000 (16 in decimal)
        System.out.println("c >> 1 = " + (c >> 1)); // Right shift: 1000 >> 1 = 0100 (4 in decimal)
        System.out.println("c >>> 1 = " + (c >>> 1)); // Unsigned right shift: 1000 >>> 1 = 0100 (4 in decimal)

        // detailed explanation of bitwise shift operators:
        // 1. Left Shift (<<): This operator shifts the bits of the number to the left
        // by a specified number of positions. Each shift to the left effectively
        // multiplies the number by 2. For example, if you have the number 8 (which is
        // 1000 in binary) and you left shift it by 1 position (8 << 1), the result is
        // 16 (which is 10000 in binary). If you left shift it by 2 positions (8 << 2),
        // the result is 32 (which is 100000 in binary).


        // 2. Right Shift (>>): This operator shifts the bits of the number to the right
        // by a specified number of positions. Each shift to the right effectively
        // divides the number by 2. For example, if you have the number 8 (1000 in
        // binary) and you right shift it by 1 position (8 >> 1), the result is 4 (which
        // is 0100 in binary). If you right shift it by 2 positions (8 >> 2), the result
        // is 2 (which is 0010 in binary).

        
        // 3. Unsigned Right Shift (>>>): This operator also shifts the bits of the
        // number to the right, but it fills the leftmost bits with zeros regardless of
        // the sign of the original number. This is particularly important for negative
        // numbers, as it will not preserve the sign bit. For example, if you have a
        // negative number like -8 (which is represented in binary as 11111111 11111111
        // 11111111 11111000 in a 32-bit signed integer), and you unsigned right shift
        // it by 1 position (-8 >>> 1), the result will be a large positive number
        // (which is 01111111 11111111 11111111 11111100 in binary, or 2147483644 in
        // decimal).
    }
}
