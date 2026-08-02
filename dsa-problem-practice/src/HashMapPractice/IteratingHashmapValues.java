package HashMapPractice;

import java.util.HashMap;

public class IteratingHashmapValues {
    public static void main(String[] args) {
        int[] arr = {1,2,1,3,2,1};
        HashMap<Integer,Integer> map = new HashMap<>();

       for(int ele: arr){
           map.put(ele,map.getOrDefault(ele,0) + 1);
       }

       for(int ele : map.values()){
           System.out.println(ele);
       }

    }
}
