package lang.string.test;

public class TestString6 {
    public static void main(String[] args) {
        String str = "start hello java, with Spring, hello Json";
        String key = "hello";

        int count = 0;
        int index = str.indexOf(key);
        while (index >= 0){
            index = str.indexOf(key, index + 1);
            count++;

        }
        System.out.println("cnt = " + count);
    }
}
