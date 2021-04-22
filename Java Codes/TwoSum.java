import java.util.*;
import java.io.*;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        ArrayList<Integer> al = new ArrayList<Integer>();
		for(int i=0;i<nums.length;i++) {
			for(int j=i+1;j<nums.length;j++) {
				int sum=0;
				sum += nums[i]+nums[j];
				if(sum==target) {
					al.add(i);
					al.add(j);
				}
			}
		}
		int arr[] = new int[al.size()];
		for(int i=0;i<arr.length;i++)
			arr[i] = al.get(i).intValue();
        return arr;
    }
}