package lang.string.equals;

/**
 * String은 반드시 equals로 비교해야한다.
 * equals는 기본으로 == (동일성 비교) 인데 문자열 비교할때는 (동등성 비교)
 */

public class StringEqualsMain1 {
    public static void main(String[] args) {
        String str1 = new String("hello");
        String str2 = new String("hello");
        //동일성 비교 = false
        System.out.println("new String == 비교: " + (str1 == str2));
        //동등성 비교 = true
        System.out.println("new String equals 비교: " + (str1.equals(str2)));

        String str3 = "welcome";
        String str4 = "welcome";
        /**
         * 동일성 비교 = true
         * 왜 true 인가?
         * String은 문자열 풀에 저장되는데 같은 리터럴이 있으면 메모리에 추가 생성하지 않음
         * 고로 같은 값이라고 판정함
         */
        System.out.println("리터럴 == 비교: " + (str3 == str4));
        //동등성 비교 = true
        System.out.println("리터럴 equals 비교: " + (str3.equals(str4)));
    }
}
