class Solution {
    public int strStr(String haystack, String needle) {
        int n = haystack.length();
        int m = needle.length();
        char[] hay = haystack.toCharArray();
        char[] nee = needle.toCharArray();
        int i = 0;
        int j = 0;
        while (i < n && j < m) {
            if (hay[i] == nee[j]) {
                i++;
                j++;
            } else {
                i = i - j + 1;
                j = 0;
            }
        }

        if (j == m)
            return i - j;
        else
            return -1;
    }

    }
