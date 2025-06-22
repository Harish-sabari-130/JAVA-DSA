import java.util.HashSet;

public class Strdup {
    public static void main(String[] args) {
        String str="abbcddeee";
        HashSet<Character> set = new HashSet<>();
        StringBuilder result = new StringBuilder();
        for(char c: str.toCharArray()) {
            if(set.add(c))
            {
                result.append(c);
            }
        }
        System.out.println(result.toString());
    }
}