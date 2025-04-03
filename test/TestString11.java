package lang.string.test;

public class TestString11 {
    public static void main(String[] args) {
        String str = "Hello JAVA";
        String resversed = new StringBuilder(str).reverse().toString();
        System.out.println(resversed);
    }
}
