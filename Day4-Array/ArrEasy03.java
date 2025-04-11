// package Day4-Array;
// Rearrange Array Elements by Sign

import java.util.*;
public class ArrEasy03 {
   public static void rearrange(ArrayList<Integer> arr) {
    ArrayList<Integer> pos = new ArrayList<>();
    ArrayList<Integer> neg = new ArrayList<>();

    for(int i = 0; i < arr.size(); i++){
        if(arr.get(i) >= 0)
            pos.add(arr.get(i));
        else
            neg.add(arr.get(i));

    }

    int posIdx = 0, negIdx = 0;
    int i = 0;

    while(posIdx < pos.size() && negIdx < neg.size()){
        if(i % 2 == 0)
            arr.set(i++, pos.get(posIdx++));

        else
            arr.set(i++, neg.get(negIdx++));
    }

    while(posIdx < pos.size()){
        arr.set(i++, pos.get(posIdx++));
    }
    while(negIdx < neg.size()){
        arr.set(i++, neg.get(negIdx++));
    }

   }

   public static void main(String[] args) {
       ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1,2,3,-4,-1,4));
       rearrange(arr);
       for (int i = 0; i < arr.size(); i++) {
           System.out.print(arr.get(i) + " ");
       }

   }
}
