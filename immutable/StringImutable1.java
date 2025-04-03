package lang.string.immutable;

/**
 * 불변 객체 String - 반드시 새로운 결과를 만들어 반환
 * 왜 불변인가?
 * 불변이 아니면 문자열 풀에 있는 다른 String 값에 영향을 줄 수 있기 때문이다.
 */
public class StringImutable1 {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = str1.concat(" JAVA");
        System.out.println("str = " + str1);
        System.out.println("str = " + str2);

    }
}
