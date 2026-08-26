class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        if (nums.length < 3) {
            return new ArrayList<>();
        }

        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {
            if (i != 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            twoSum(nums, i + 1, result, -nums[i]);
        }

        return result;
    }

    private void twoSum(int[] nums, int k, List<List<Integer>> result, int target) {
        int i = k, j = nums.length - 1;

        while (i < j) {
            if (nums[i] + nums[j] > target) {
                j--;
            } else if (nums[i] + nums[j] < target) {
                i++;
            } else {
                result.add(Arrays.asList(-target, nums[i], nums[j]));

                while (i < j && nums[i] == nums[i + 1]) {
                    i++;
                }
                while (i < j && nums[j] == nums[j - 1]) {
                    j--;
                }

                i++;
                j--;
            }
        }
    }
}
// APPROACH 1 - brute force
/* 
 int n=nums.length;
        Set<List<Integer>> st=new HashSet<>();
     for(int i=0;i<n;i++){
        for(int j=i+1;j<n;j++){
            for(int k=j+1;k<n;k++){
                if(nums[i]+nums[j]+nums[k]==0)
                {
                    List<Integer> temp = Arrays.asList(nums[i], nums[j], nums[k]);
                        Collections.sort(temp);
                        st.add(temp);

                }
            }
        }
     }
     return new ArrayList<>(st); */




     //APPROACH 2 -- HASHING
     /*
      int n = nums.length;
        Set<List<Integer>> ans = new HashSet<>();

        for (int i = 0; i < n; i++) {

            Set<Integer> hashset = new HashSet<>();

            for (int j = i + 1; j < n; j++) {

                int third = -(nums[i] + nums[j]);

                if (hashset.contains(third)) {
                    List<Integer> temp = Arrays.asList(nums[i], nums[j], third);
                    Collections.sort(temp);
                    ans.add(temp);
                }

                hashset.add(nums[j]);
            }
        }

        return new ArrayList<>(ans);
    */