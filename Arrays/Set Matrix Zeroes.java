class Solution {
    public List<List<String>> groupAnagrams(String[] s) 
    {
        HashMap<String,List<String>> map=new HashMap<>();
        for(int i=0;i<s.length;i++)
        {
            char[] c=s[i].toCharArray();
            Arrays.sort(c);
            String st=String.valueOf(c);
            if(!map.containsKey(st))
            {
                map.put(st,new ArrayList<>());
            }
            map.get(st).add(s[i]);
        }
        return new ArrayList<>(map.values());
    }
}
