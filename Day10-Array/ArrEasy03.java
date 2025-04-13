// package Day10-Array;
// 1732. Find the Highest Altitude
// https://leetcode.com/problems/find-the-highest-altitude/description/

public class ArrEasy03 {
    public int largestAltitude(int[] gain) {
        int currentAltitude = 0;
        int maxAltitude = 0;
        for(int g : gain){
            currentAltitude += g;
            maxAltitude = Math.max(currentAltitude, maxAltitude);
        }

        return maxAltitude;
    }
}
