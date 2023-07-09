import java.util.Arrays;

public class PlusOne {
    public int[] plusOne(int[] digits) {
        int n = digits.length;

        // Iterate through the digits in reverse order
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            } else {
                digits[i] = 0;
            }
        }

        // If all digits are 9, create a new array with one additional digit
        int[] newDigits = new int[n + 1];
        newDigits[0] = 1;

        return newDigits;
    }

    public static void main(String[] args) {
        int[] digits = {1, 2, 3};

        PlusOne plusOne = new PlusOne();
        int[] result = plusOne.plusOne(digits);

        System.out.println(Arrays.toString(result));
    }
}
