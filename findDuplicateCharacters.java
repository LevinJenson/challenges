
import java.util.Set;
import java.util.HashSet;

class Main {
    public static void main(String[] args) {
    String s = "qwerqwer";
    Set<Character> seen = new HashSet<>();
    char[] chars = s.toCharArray();
    for(char ch : chars){
        if(!seen.add(ch)){
            System.out.println(ch);
        }
    }
    }
}
