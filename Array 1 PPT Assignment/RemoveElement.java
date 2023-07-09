import java.util.Arrays;

public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int k = 0; // Variable to keep track of the number of elements not equal to val

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 2, 3};
        int val = 3;

        RemoveElement removeElement = new RemoveElement();
        int k = removeElement.removeElement(nums, val);

        System.out.println("k = " + k + ", nums = " + Arrays.toString(nums));
    }
}
