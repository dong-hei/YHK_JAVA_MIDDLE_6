package lang.string.method;

public class StringChangeMain {
    public static void main(String[] args) {
        String str = "Hello, Java! Welcome to the Java World";
        System.out.println("인덱스 7부터의 부분 문자열" + str.substring(7));
        System.out.println("인덱스 7부터 15의 부분 문자열" + str.substring(7,15));

        System.out.println("문자열 결합 : " + str.concat("!!!"));
        System.out.println("Java를 Universe로 대체 : " + str.replace("Java", "Universe"));
        System.out.println("첫번째 Java를 Universe로 대체 : " + str.replaceFirst("Java", "Universe"));
    }
}
