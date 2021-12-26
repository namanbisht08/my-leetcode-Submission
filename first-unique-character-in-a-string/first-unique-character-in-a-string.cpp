class Solution {
public:
    int firstUniqChar(string s) {
        map <char, int> om;
        for(int i=0; i<s.size(); i++){
            om[s[i]] ++;
            
        }
        for(int i=0; i<s.length(); i++)
            if(om[s.at(i)] == 1)
                return i;
        return -1;
    }
};
