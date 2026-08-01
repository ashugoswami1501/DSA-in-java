class Solution {
    public int gcdOfOddEvenSums(int n) {
        int sumodd=n*n;
        int sumeven=n*(n+1);
        if(sumodd==0||sumeven==0){
            return sumeven;
        }
        while(sumodd!=0){
           int rem=sumeven%sumodd;
            sumeven=sumodd;
            sumodd=rem;
        }
        return sumeven;
    }
}