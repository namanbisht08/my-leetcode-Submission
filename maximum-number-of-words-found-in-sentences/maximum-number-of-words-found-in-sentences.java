class Solution {
    public int mostWordsFound(String[] s) {
        int ans=0;
        for(int i =0; i<s.length; i++)
        {
            int cur=0;
            char ch[]=s[i].toCharArray();
            for(int j=0; j<ch.length; j++)
            {
                if(ch[j]==' ')
                   cur++; 
            }
            if(cur+1>ans)
                ans=cur+1;
        }
        return ans;
    }
}