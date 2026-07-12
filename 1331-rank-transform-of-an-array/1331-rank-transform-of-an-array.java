class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int a[]=arr.clone();
        Arrays.sort(a);
         HashMap<Integer, Integer> rank = new HashMap<>();
        int currentRank = 1;

        for (int num : a) {
            if (!rank.containsKey(num)) {
                rank.put(num, currentRank++);
            }
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rank.get(arr[i]);
        }

        return arr;
    }
}