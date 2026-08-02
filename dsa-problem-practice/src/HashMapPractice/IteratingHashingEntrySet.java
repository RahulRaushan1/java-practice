package HashMapPractice;
import java.util.HashMap;
import java.util.Map;
public class IteratingHashingEntrySet {
    public static void main(String[] args) {
        int[] arr = {1,2,1,3,2,1};
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int ele : arr){
            map.put(ele,map.getOrDefault(ele,0)+1);
        }

        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }

    }
}
