package lang.string.method;

public class StringComparisonMain {
    public static void main(String[] args) {
        String str1 = "Hello JAVA!"; // 대문자 일부
        String str2 = "Hello java!"; // 대문자 없음
        String str3 = "Hello, Universe!";

        System.out.println("str equals str2: " + str1.equals(str2));
        System.out.println("str equalsIgnoreCase str2 (대소문자 무시하고 비교): " + str1.equalsIgnoreCase(str2));

        System.out.println("'a' compareTo 'b' : " + "a".compareTo("b"));
        System.out.println("str1 CompareTo str3 : " + str1.compareTo(str3));
        System.out.println("str1 CompareTo str2 : " + str1.compareToIgnoreCase(str2));

        System.out.println("str1 start with 'Hello : " + str1.startsWith("Hello"));
        System.out.println("str1 end with 'JAVA!' " + str1.startsWith("JAVA!"));
    }
}
