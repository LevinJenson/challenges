import java.util.Stack;

class Main {
    public static void main(String[] args) {
        Stack<Character> hold = new Stack<>();
        String word = "Go**gle*";
        char[] words = word.toCharArray();
        for(char ch : words){
            if(ch == '*'){
                if(!hold.isEmpty()){
                    hold.pop();
                }
            }else{
                hold.push(ch);
            }
        }
        StringBuilder builder = new StringBuilder();
        for(char ch : hold){
            builder.append(ch);
        }
        System.out.println(builder.toString());
    }
}
