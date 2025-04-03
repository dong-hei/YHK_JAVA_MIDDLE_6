package lang.string.method;

public class StringUtilsMain1 {
    public static void main(String[] args) {
        int num = 100;
        boolean boo = true;
        Object obj = new Object();
        String str = "Hello, Universe!";

        // valueOf = 문자열로 변환
        String numString = String.valueOf(num);
        System.out.println("숫자의 문자열 값 : " + numString);
        String booString = String.valueOf(boo);
        System.out.println("불리언의 문자열 값 : " + booString);
        String objString = String.valueOf(obj);
        System.out.println("불리언의 문자열 값 : " + objString);

        //문자 + 빈것 -> 문자처리
        String numString2 = "" + num;
        System.out.println("빈문자 + num : " + numString2);

        // toCharArray - 문자열 출력
        char[] strCharArr = str.toCharArray();
        for (char c : strCharArr) {
            System.out.print(c);
        }
    }
}
