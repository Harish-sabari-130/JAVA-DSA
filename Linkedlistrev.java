
import java.util.LinkedList;

public class Linkedlistrev {
    public static void main(String[] args) {
        String str = "hello";
        LinkedList<Character> list = new LinkedList<>();
        for(char c:str.toCharArray()) {
            list.addFirst(c);
        }
        StringBuilder sb = new StringBuilder();
        for(char c:list) {
            sb.append(c);
        }
        System.out.println(str);
        System.out.println(sb.toString());
    }
}
