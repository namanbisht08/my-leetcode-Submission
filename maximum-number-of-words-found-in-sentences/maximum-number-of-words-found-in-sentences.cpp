class Solution {
public:
    int mostWordsFound(vector<string>& sentences) {
        int maxcount=0;
        for(auto &it : sentences)
        {
            int cnt=count(it.begin(),it.end(),' ')+1;        //STL function to count no. of space
            maxcount=max(maxcount, cnt);
        }
        return maxcount;
    }
};

/*
class Solution {
public:
    int mostWordsFound(vector<string>& sentences) {
        int maxcount=0;
        for(auto &it : sentences)
        {
            int count=0;
            for(auto &ch : it)
                if(ch==' ')
                    count++;
            maxcount=max(maxcount, count);
        }
        return maxcount+1;
    }
};
*/
