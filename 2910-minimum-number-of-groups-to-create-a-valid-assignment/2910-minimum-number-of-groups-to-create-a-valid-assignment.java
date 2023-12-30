class Solution {
    // public int minGroupsForValidAssignment(int[] nums) {
        private int ans;

    public void solve(Map<Integer, Integer> m, int k) {
        int c = 0;
        int a = k, b = k + 1;
        int f = 0;
        for (Map.Entry<Integer, Integer> entry : m.entrySet()) {
            int s = entry.getValue();
            if (s == a || s == b) {
                c++;
                continue;
            }
            int x = s / b;
            s = s % b;
            if (s == 0) {
                c = c + x;
                continue;
            }
            int y = a - s;
            if (x >= y) {
                c = c + x + 1;
            } else {
                f = 1;
                break;
            }
        }
        if (f == 0) {
            ans = Math.min(ans, c);
        }
    }

    public int minGroupsForValidAssignment(int[] v) {
        int n = v.length;
        Map<Integer, Integer> m = new HashMap<>();
        for (int i : v) {
            m.put(i, m.getOrDefault(i, 0) + 1);
        }
        int l = 1, h = Integer.MAX_VALUE;
        for (int value : m.values()) {
            h = Math.min(h, value);
        }
        ans = Integer.MAX_VALUE;
        while (l <= h) {
            solve(m, l);
            l++;
        }
        return ans;
    }
}