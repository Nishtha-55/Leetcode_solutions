class Solution {

    public int findComplement(int num) {

        int ans = 0;
        int power = 1;

        while (num > 0) {

            // Get the last binary bit
            int bit = num % 2;

            // Flip the bit:
            // 0 becomes 1, so add its place value
            if (bit == 0) {
                ans += power;
            }

            // Remove the last binary bit
            num = num / 2;

            // Move to the next binary position
            power = power * 2;
        }

        return ans;
    }
}