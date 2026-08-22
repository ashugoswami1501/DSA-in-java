class Solution {
    public boolean checkDivisibility(int n) {
        int sum=0,product=1,s=0,temp=n;
        while(n>0){
            sum+=n%10;
            product=product*(n%10);
            n=n/10;
        }
        s=sum+product;
        return(temp%s==0);
    }
}