class Solution {
    public boolean canAliceWin(int n) { 
        if(n<10) 
        return false;
        int x=10;
        while(n>=x){
            n=n-x;
            x--;
        }
        return x%2==1;
    }
}