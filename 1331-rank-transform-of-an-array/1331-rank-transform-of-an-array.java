class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int a[]=arr.clone();    //The clone() method in Java arrays creates and returns a new array object containing the exact same elements (or object references) as the source array
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