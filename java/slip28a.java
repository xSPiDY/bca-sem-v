import java.util.*;
public class slip28a {
    public static void main(String[] args) {
        int count = 0;
        List<String> al = new ArrayList<>();
        for (int i = 0; i < args.length; i++) {
            al.add(args[i]);
        }
        for (int i = 0; i < al.size(); i++) {
            String element = al.get(i);
            try {
                int j = Integer.parseInt(element);
                count++;
            } catch (NumberFormatException e) {}
        }
        System.out.println(count + " integers present in list");
    }
}