import java.util.Set;
import java.util.HashSet;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> intersections = new HashSet<>();

        for (int num : nums1) {
            set.add(num);
        }

        for (int num : nums2) {
            if (set.contains(num)) {
                intersections.add(num);
            }
        }

        int[] result = new int[intersections.size()];
        int i = 0;
        for (int num : intersections) {
            result[i++] = num;
        }

        return result;
    }
}
