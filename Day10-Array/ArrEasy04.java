// package Day10-Array;
// 1773. Count Items Matching a Rule
// https://leetcode.com/problems/count-items-matching-a-rule/description/
import java.util.*;
public class ArrEasy04 {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;
        int index = 0;
        if(ruleKey.equals("color")) index = 1;
        else if(ruleKey.equals("name")) index = 2;

        for(List<String> item: items){
            if(item.get(index).equals(ruleValue))
                count++;
        }
        return count;
    }
}
