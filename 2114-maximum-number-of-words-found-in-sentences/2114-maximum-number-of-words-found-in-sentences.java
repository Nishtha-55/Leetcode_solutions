class Solution {
    public int mostWordsFound(String[] sentences) {
        int max = 0;
        for (String sent : sentences) {
            max = Math.max(max, sent.split(" ").length);
        }
        return max;
    }
}