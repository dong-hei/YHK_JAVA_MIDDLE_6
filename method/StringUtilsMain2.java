package lang.string.method;

public class StringUtilsMain2 {
    public static void main(String[] args) {
        int num = 100;
        boolean boo = true;
        String str = "Hello, Universe!";

        //format 메소드
        String format1 = String.format("num: %d, bool: %b, str: %s", num, boo, str);
        System.out.println(format1);

        //소수점 둘째자리
        String format2 = String.format("숫자 : %.2f", 10.1234);
        System.out.println(format2);

        // printf
        System.out.printf("숫자 : %.2f\n", 10.1234);

        // matches 메소드
        String regex = "Hello, (Universe!|World)";
        System.out.println("str이 패턴과 일치하는가 ? " + str.matches(regex));

    }
}
