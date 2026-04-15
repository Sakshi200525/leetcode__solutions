class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, -1};
        if (nums == null || nums.length == 0) {
            return ans;
        }

        ans[0] = findFirst(nums, target);
        ans[1] = findLast(nums, target);
        return ans;
    }

    private int findFirst(int[] nums, int target) {
        int start = 0, end = nums.length - 1;
        int ans = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2; // Overflow se bachne ke liye
            if (nums[mid] == target) {
                ans = mid;
                end = mid - 1; // Pehla wala dhoondne ke liye left side jao
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return ans;
    }

    private int findLast(int[] nums, int target) {
        int start = 0, end = nums.length - 1;
        int ans = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                ans = mid;
                start = mid + 1; // Aakhri wala dhoondne ke liye right side jao
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return ans;
    }
}