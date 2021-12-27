class Solution {
public:
    int findPeakElement(vector<int>& nums) {
        vector<int> v(nums);
        sort(v.begin(), v.end());
        
        int n=0;
        for(int it : nums)
        {
            if(it == *(v.end()-1))
                return n;
            n++;
        }
        return n;
    }
};