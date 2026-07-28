class Solution 
{
    public int romanToInt(String s) 
    {
        int n=0;
        int sum=0;
       HashMap<String,Integer> map=new HashMap<>();
       map.put("I", 1);
       map.put("V", 5);
       map.put("X", 10);
       map.put("L", 50);
       map.put("C", 100);
       map.put("D", 500);
       map.put("M", 1000);
       map.put("IV", 4);
       map.put("IX", 9);
       map.put("XL", 40);
       map.put("XC", 90);
       map.put("CD", 400);
       map.put("CM", 900);
       for (int i = 0; i < s.length(); i++) {
            boolean flag = false;
            String ch = Character.toString(s.charAt(i));
            if (i < s.length() - 1) {
                String sub = s.substring(i, i + 2);
                if (map.containsKey(sub)) {
                    sum = sum + map.get(sub);
                    flag = true;
                    i++;
                } else {
                    sum = sum + map.get(ch);
                }
            } else if (flag == false) {
                sum = sum + map.get(ch);
            }
        }
        return sum;
}
}
