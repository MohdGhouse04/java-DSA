//package String;

public class string_builder {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char ch =(char)('a' + i);
            builder.append(ch);//does not use new memory to store
            
        }
        System.out.println(builder.toString());
    }
}
