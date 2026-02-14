import java.util.*;

public class variable_arg {

    public int sum(int a, int b) {
        return a + b;
    }

    public int sum(int a, int b, int c) {
        return a + b + c;
    }

    public int sum(int a, int b, int c, int d) {
        return a + b + c + d;
    }

    public static void main(String[] args) {
        variable_arg obj = new variable_arg();

        int result = obj.sum(1, 2);
        System.out.println(result);
        int result1 = obj.sum(1, 2, 3);
        System.out.println(result1);

    }

}
