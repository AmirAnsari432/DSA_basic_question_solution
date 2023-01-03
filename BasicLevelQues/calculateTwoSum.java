package BasicLevelQues;

public class calculateTwoSum {
    public static void main(String[] args) {
        int[] nums = { 3, 4, 2 };
        int target = 7;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    System.out.println(target);
                }
            }
        }
        System.out.println();
    }
}
