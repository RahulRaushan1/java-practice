package HashMapPractice;
import java.util.HashMap;
import java.util.Map;
public class UpdatingCharacterFrequency {
    public static void main(String[] args) {
        String s= "banana";
        HashMap<Character,Integer> map = new HashMap<>();
        // s.toCharArray convert String to Character Array
        for(Character ch: s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        for(Map.Entry<Character,Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
