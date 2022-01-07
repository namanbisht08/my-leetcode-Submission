class Solution {
public:
    int numPairsDivisibleBy60(vector<int>& time) {
      vector<int> mpp(60,0);
      int cnt =0;
      for(auto it : time)
      {
          int num = it%60;
          if(num==0) cnt+=mpp[0];
          else cnt +=mpp[60-num];
          mpp[num]++;
      }
        return cnt++;
    }
};