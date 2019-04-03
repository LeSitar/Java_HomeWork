import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        System.out.println(mutateString("0200670840"));
        System.out.println(mutateStringTwo("0200670840"));
        System.out.println(mutateStringThree("0200670840"));
    }

    private static String mutateString(String input) {

        StringBuffer temp = new StringBuffer();
        StringBuffer temp2 = new StringBuffer();
        char c = '0';

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == c) {
                temp.append(input.charAt(i));
            } else {
                temp2.append(input.charAt(i));
            }
        }
        return temp.append(temp2).toString();
    }

    private static String mutateStringTwo(String input) {
        String str = "0";
        StringBuffer temp = new StringBuffer();
        List<String> inputs = new ArrayList<>(Arrays.asList(input.split("")));
        List<String> strings = inputs.stream().filter(s -> s.equals(str)).collect(Collectors.toList());
        List<String> collect = inputs.stream().filter(s -> !s.equals(str)).collect(Collectors.toList());

        return temp.append(strings).append(collect).toString();
    }

    private static String mutateStringThree(String input) {
        int count = 0;
        StringBuffer temp = new StringBuffer();
        char c = '0';
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == c) {
                count++;
            }
            while (temp.length() < count) {
                temp.append("0");
            }
        }
        return temp.append(input.replaceAll("0", "")).toString();
    }
}

// I think the first solution is the best.
