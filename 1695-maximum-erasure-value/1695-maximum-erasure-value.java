class Solution {
    public int maximumUniqueSubarray(int[] a){
        Set<Integer> s = new HashSet<>();
        int sum = 0, r = 0;
        for(int lo = 0, hi = 0; hi < a.length; )
            if(s.add(a[hi])){
                sum += a[hi++];
                r = Math.max(sum, r);
            }else{
                sum -= a[lo];
                s.remove(a[lo++]);
            }
        return r;
    }
}