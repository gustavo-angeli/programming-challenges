import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupThePeople {
    public static List<List<Integer>> groupThePeople(int[] groupSizes) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        List<List<Integer>> indexes = new ArrayList<>();

        for (int i = 0; i < groupSizes.length; i++){
            int size = groupSizes[i];
            if (!map.containsKey(size)){
                map.put(size, new ArrayList<>(size));
            }
            map.get(size).add(i);
            if (map.get(size).size() == size) {
                indexes.add(map.get(size));
                map.put(size, new ArrayList<>(size));
            }
        }
        return indexes;
    }

    public static void main(String[] args) {
        groupThePeople(new int[]{3,3,3,3,3,1,3}).forEach(e -> System.out.println(e.toString()));
    }
}
