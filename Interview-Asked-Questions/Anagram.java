import java.util.*;

class Main {
    public static void main(String[] args) {
        String s1 = "eat";
        String s2 = "tea";

        char[] a = s1.toCharArray();
        char[] b = s2.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        System.out.println(Arrays.equals(a, b));
    }
}
