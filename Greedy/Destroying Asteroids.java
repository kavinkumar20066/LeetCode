class Solution {
    public boolean asteroidsDestroyed(int m, int[] a) {
        Arrays.sort(a);
        long sum=m;
        for(int i=0;i<a.length;i++)
        {
            if(sum>=a[i])
            {
                sum=sum+a[i];
            }
            else
            {
                return false;
            }
        }
        return true;
    }
}
