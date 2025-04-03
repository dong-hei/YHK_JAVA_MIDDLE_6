package lang.string.test;

public class TestString10 {
    public static void main(String[] args) {
        String fruits = "apple,banana,mango";

        String[] split = fruits.split(",");
        for (String str : split) {
            System.out.println(str);
        }

        String join = String.join("=>", split);
        System.out.println("join = " + join);
    }
}
