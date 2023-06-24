class Solution {
    public double[] convertTemperature(double celsius) {
        double kel = celsius +273.15;
        double far = celsius*1.80+32;
        double[] temp = {kel, far};
        return(temp);
    }
}