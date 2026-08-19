import java.util.*;

/*

first loop all those and 
then store it in the map

*/

public class Main {
    public static void main(String[] args) {
      List<String> words = Arrays.asList("eat", "tea", "tan", "ate", "nat", "bat", "cat");
      Map<String, List<String>> map = new HashMap<>();
      for (int i = 0; i< words.size();i++){
        String word = words.get(i);
        char[] wordChars = word.toLowerCase().toCharArray();
        Arrays.sort(wordChars);
        String key = new String(wordChars);

        //map.computeIfAbsent(key, k -> new ArrayList<>()).add(word);
        List<String> groups = map.get(key);
        if(groups == null){
          groups = new ArrayList();
          map.put(key, groups);
        }
        groups.add(word);
      }
      
      List<List<String>> result = new ArrayList();
        for (List<String> groups : map.values()){
          result.add(groups);
        }
      System.out.println(result);
    }
    
}
