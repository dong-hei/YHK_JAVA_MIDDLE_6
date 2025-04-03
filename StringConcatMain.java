package lang.string;

/**
 * 원칙적으로 안되는데 문자열에 한해서 특별히 + 연산을 제공한다.
 */
public class StringConcatMain {
    public static void main(String[] args) {
        String a = "hello ";
        String b = "JAVA";

        String r1 = a.concat(b);
        String r2 = a + b;
        System.out.println("r1 = " +r1);
        System.out.println("r2 = " +r2);
    }
}
