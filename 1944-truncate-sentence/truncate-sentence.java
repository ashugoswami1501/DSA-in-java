class Solution {
    public String truncateSentence(String s, int k) {
        String str="";
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                count++;
            if(count==k)
                return (str);
            }
            str=str+s.charAt(i);
        }
        return str;
    }
}