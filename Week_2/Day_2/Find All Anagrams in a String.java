class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();
        if (p.length() > s.length()) {
            return ans;
        }
        int[] pCount = new int[26];
        int[] windowCount = new int[26];
        for (int i = 0; i < p.length(); i++) {
            pCount[p.charAt(i) - 'a']++;
            windowCount[s.charAt(i) - 'a']++;
        }
        if (matches(pCount, windowCount)) {
            ans.add(0);
        }
        int left = 0;
        for (int right = p.length(); right < s.length(); right++) {
            windowCount[s.charAt(right) - 'a']++;
            windowCount[s.charAt(left) - 'a']--;
            left++;
            if (matches(pCount, windowCount)) {
                ans.add(left);
            }
        }
        return ans;
    }
    private boolean matches(int[] a, int[] b) {
        for (int i = 0; i < 26; i++) {
            if (a[i] != b[i]) {
                return false;
            }
        }
        return true;
    }
}
