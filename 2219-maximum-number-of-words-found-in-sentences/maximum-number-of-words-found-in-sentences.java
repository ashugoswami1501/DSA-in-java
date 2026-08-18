class Solution {
    public int mostWordsFound(String[] sentences) {
        int n=sentences.length;
        int maxcount=0;
        for(int i=0;i<n;i++){
            int count=1;
            for(int j=0;j<sentences[i].length();j++){
                if(sentences[i].charAt(j)==' '){
                    count++;
                }       
                if(count>maxcount){
                    maxcount=count;
                }
            }
        }
        return maxcount;
    }
}