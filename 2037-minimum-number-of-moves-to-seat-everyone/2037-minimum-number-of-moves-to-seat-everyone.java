class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
        Arrays.sort(students);
        Arrays.sort(seats);
        int sum = 0;
        for(int i = 0; i < seats.length; i++) {
            sum += Math.abs(seats[i] - students[i]);
        }
        return sum;
    }
}