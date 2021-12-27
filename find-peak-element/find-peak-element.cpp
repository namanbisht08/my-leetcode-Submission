class Solution {
public:
    int findPeakElement(vector<int>& nums) {
        vector<int> v(nums);        //make copy of nums
        sort(v.begin(), v.end());  //sort vector v in assesending order
        
        int n=0;
        for(int it : nums)
        {
            if(it == *(v.end()-1))  //if the (value it) == (the largest value present in vector) return count of itreation.
                return n;
            n++;
        }
        return n;
    }
};
