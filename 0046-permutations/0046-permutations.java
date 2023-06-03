class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        permuteHelper(result, new ArrayList<>(), nums);
        return result;
    }
    
    private void permuteHelper(List<List<Integer>> result, List<Integer> temp, int[] nums) {
        if (temp.size() == nums.length) {
            // result.add(temp);  // NOTICE: doesn't work as Java array reference
            result.add(new ArrayList<>(temp));
        } else {
            for (int i = 0; i < nums.length; ++i) {
                if (temp.contains(nums[i])) continue;
                temp.add(nums[i]);
                permuteHelper(result, temp, nums);
                temp.remove(temp.size() - 1);
            }
        }
    }
}