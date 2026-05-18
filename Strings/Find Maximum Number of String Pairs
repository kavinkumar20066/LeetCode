class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
        int count = 0;

        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {

                String rev = "" + words[j].charAt(1) + words[j].charAt(0);

                if (words[i].equals(rev)) {
                    count++;
                }
            }
        }

        return count;
    }
}
