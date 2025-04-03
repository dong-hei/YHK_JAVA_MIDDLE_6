package lang.string.method;

public class StringInfoMain {
    public static void main(String[] args) {
        String str = "United State of America";
        System.out.println("문자열 길이 : " + str.length());
        System.out.println("문자열 비어있나? : " + str.isEmpty());
        System.out.println("문자열 공백인가? : " + str.isBlank());
        System.out.println("문자열이 비어있거나 공백인가 ? : " + "  ".isBlank());

        char c = str.charAt(7);
        System.out.println("7번 인덱스의 문자 = " + c);
    }
}
