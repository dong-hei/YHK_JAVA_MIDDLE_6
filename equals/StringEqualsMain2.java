package lang.string.equals;

/**
 * 상황에 따라 true가 false가 될수있기에 반드시 equal을 사용하자.
 */

public class StringEqualsMain2 {
    public static void main(String[] args) {
        String str1 = new String("hello");
        String str2 = new String("hello");
        System.out.println(" 메소드 호출 비교 1 : " + isSame(str1, str2));

        String str3 = "hello";
        String str4 = "hello";
        System.out.println(" 메소드 호출 비교 2 : " + isSame(str3, str4));

    }

    private static boolean isSame(String x, String y){
//        return x == y;
        return x.equals(y);
    }
}
