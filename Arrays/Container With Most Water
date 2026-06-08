class Solution {
    public int maxArea(int[] h) {
        int i=0;
        int j=h.length-1;
        int sum=0;
        int k=j;
        while(i<h.length && j>0 && k>0)
        {
            int y=Math.min(h[i],h[j]);
            int f=k*y;
            sum=Math.max(f,sum);
            if(h[i]<h[j])
            {
                i++;
                k--;
            }
            else if(h[j]<h[i])
            {
                j--;
                k--;
            }
            else
            {
                i++;
                j--;
                k=k-2;
            }
        }
        return sum;
    }
}
