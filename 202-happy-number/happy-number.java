class Solution {
    public boolean isHappy(int n) {
        for (int i = 0; i < n; i++) {
            int sum=0;
            while (n > 0) {
               int a = n % 10;
                sum += Math.pow(a, 2);
                n = n / 10;
            }
            n = sum;
        }
        return n == 1;
    }
}