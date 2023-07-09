import java.util.Arrays;

public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int i = 0; // Pointer to track the position of the next non-zero element

        // Traverse the array
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != 0) {
                nums[i] = nums[j];
                i++;
            }
        }

        // Fill the remaining positions with zeros
        while (i < nums.length) {
            nums[i] = 0;
            i++;
        }
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};

        MoveZeroes moveZeroes = new MoveZeroes();
        moveZeroes.moveZeroes(nums);

        System.out.println(Arrays.toString(nums));
    }
}
