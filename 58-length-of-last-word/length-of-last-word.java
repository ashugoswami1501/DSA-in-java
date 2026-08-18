class Solution {
    public int lengthOfLastWord(String s) {
        int n=s.length();
        String[] arr=new String[n];
        arr=s.split(" ");
        int len=arr.length;
        return arr[len-1].length();
    }
}