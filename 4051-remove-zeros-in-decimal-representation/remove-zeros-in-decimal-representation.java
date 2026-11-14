class Solution {
    public long removeZeros(long n) {
        long revsum=0;
        while(n>0){
            long p=n%10;
            if(p!=0){
            revsum=revsum*10+p;
            }
            n=n/10;
        }
        long sum=0;
        while(revsum>0){
            sum=sum*10+revsum%10;
            revsum=revsum/10;
        }
        return sum;
    }
}