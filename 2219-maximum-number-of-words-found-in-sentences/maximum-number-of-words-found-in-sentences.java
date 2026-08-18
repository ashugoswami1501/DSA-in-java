class Solution {
    public int mostWordsFound(String[] sentences) {
        int n=sentences.length;
        int maxcount=0;
        for(int i=0;i<n;i++){
            int words=sentences[i].split(" ").length;
            maxcount=Math.max(maxcount,words);
        }
        return maxcount;
    }
}