// package Day9-Array;
// 1854. Maximum Population Year
// https://leetcode.com/problems/maximum-population-year/description/
public class ArrEasy01 {
    public int maximumPopulation(int[][] logs) {
        int [] yearChange = new int [101];
        for(int []log : logs){
            yearChange[log[0] - 1950]++;
            yearChange[log[1] - 1950]--;

        }

        int maxYear = 1950;
        int maxPopulation = yearChange[0];
        int currentPopulation = yearChange[0];
        for(int i = 1; i < 101; i++){
            currentPopulation += yearChange[i];
            if(currentPopulation > maxPopulation){
                maxPopulation = currentPopulation;
                maxYear = 1950 + i;
            }
        }
        return maxYear;
    }
}
