class Solution {
    public int lengthOfLastWord(String s) {
        int count=0;
        int count2=0;
        for(int i=s.length()-1;i>=0;){
            char ch=s.charAt(i);
            if(ch==' '&&count2==0){
                i--;
            }
           else if(ch!=' '){
                count++;
                count2++;
                i--;
            }
            else{
            break;
            }
           
        }
        return count;
    }
}
