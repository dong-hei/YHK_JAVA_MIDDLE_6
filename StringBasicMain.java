package lang.string;

public class StringBasicMain {
    public static void main(String[] args) {
        //String은 참조형이다. 즉 참조값만 들어갈 수 있다.
        String str1 = "hello"; // 편의상 이렇게 해준다.
        String str2 = new String("donghei"); // 원래 자바언어가 이렇게 받는다.

        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);
    }
}
