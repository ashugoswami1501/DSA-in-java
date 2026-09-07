class Solution {
    public boolean isvowel(char ch){
        return "aeiou".indexOf(ch)!=-1;
    }
    public int maxVowels(String s, int k) {
        int j=0,count=0;
        for(int i=0;i<k;i++){
            if(isvowel(s.charAt(i))){
                count++;
            }
        }
        int max=count;
        for(int i=k;i<s.length();i++){
            if(isvowel(s.charAt(i))){
                count++;
            }
            if(isvowel(s.charAt(j))){
                count--;
            }
            max=Math.max(max,count);
            j++;
        }
        return max;
    }
}