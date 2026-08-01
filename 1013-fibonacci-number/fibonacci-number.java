class Solution {
    public int fib(int n) {
        int a=0,b=1,sum=0;
        if(n==0)
        return 0;
        for(int i=1;i<n;i++){
            sum+=a+b;
            a=b;
            b=sum;
            sum=0;
        }
        return b;
    }
}