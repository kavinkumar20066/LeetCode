class Solution {
    public int numberOfSpecialChars(String w) {
       int count=0;
       boolean[] u=new boolean[26];
       boolean[] l=new boolean[26];
       for(int i=0;i<w.length();i++)
       {
        char c=w.charAt(i);
        if(c>='a' && c<='z')
        {
            l[c-'a']=true;
        }
        else
        {
            u[c-'A']=true;
        }
       }
       for(int i=0;i<l.length;i++)
       {
        if(l[i]==true && u[i]==true)
        {
            count++;
        }
       }
       return count; 
    }
}
