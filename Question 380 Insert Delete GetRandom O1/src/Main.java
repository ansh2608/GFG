import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Main {
    public static class RandomizedSet {
        public ArrayList<Integer> list;
        public Map<Integer,Integer> map;
        public RandomizedSet() {
            list=new ArrayList<>();
            map=new HashMap<>();
        }
        public boolean search(int val){
            return map.containsKey(val);
        }
        public boolean insert(int val) {
            if (search(val)) return false;
            list.add(val);
            map.put(val, list.size()-1);
            return true;
        }
        public boolean remove(int val) {
            if (!search(val)) return false;
            int idx=map.get(val);
            list.set(idx,list.get(list.size()-1));
            map.put(list.get(idx),idx);
            list.remove(list.size()-1);
            map.remove(val);
            return true;
        }
        public int getRandom() {
            Random rnd=new Random();
            return list.get(rnd.nextInt(list.size()));
        }
    }
    public static void main(String[] args) {
        RandomizedSet random=new RandomizedSet();
        System.out.println(random.insert(1));
        System.out.println(random.remove(2));
        System.out.println(random.insert(2));
        System.out.println(random.getRandom());
    }
}