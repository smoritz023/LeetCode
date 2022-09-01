import java.util.Arrays;

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int i = 0; i < n; i++){
            nums1[m] = nums2[i];
            System.out.println("Step: "+i+", nums1: "+nums1[i]+", nums2: "+nums2[i]);
            m++;
        }
        Arrays.sort(nums1);
    }
}