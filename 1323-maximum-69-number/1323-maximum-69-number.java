class Solution {
    public int maximum69Number(int num) {
        String Str = String.valueOf(num);
        int index = Str.indexOf('6');
        if (index == -1) {
            return num;
        } else {
            char[] Array = Str.toCharArray();
            Array[index] = '9';
            return Integer.parseInt(new String(Array));
        }
    }
}
