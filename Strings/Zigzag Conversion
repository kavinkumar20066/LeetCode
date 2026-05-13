class Solution {
    public String convert(String s, int n) {

        if (n == 1 || s.length() <= n) {
            return s;
        }
       String[][] a=new String[n][s.length()];
       int i=0;
       int k=0;
       int j=0;
       boolean flag=true;
       while(i<s.length() && k<s.length())
       {
           if(flag==true)
           {
               while(j<n && k<s.length())
               {
                   a[j][i]=String.valueOf(s.charAt(k));
                   k++;
                   j++;
               }
               i++;
               j--;
               flag=false;
           }
           else if(k<s.length())
           {
               j--;
               a[j][i]=String.valueOf(s.charAt(k));
               k++;
               if(j!=0) {
                   i++;
                   flag=false;
               }
               else 
               {
                   flag=true;
                   j++;
                   i++;
               }
           }
           if(k==s.length())
           {
               break;
           }
       }
        StringBuilder sb=new StringBuilder();
        for(String[] row: a)
        {
            for (String f:row)
            {
                if(f!=null) {
                    sb.append(f);
                }
            }
        }
        return sb.toString();
    }
}
