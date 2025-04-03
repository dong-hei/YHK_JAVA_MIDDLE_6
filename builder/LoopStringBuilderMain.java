package lang.string.builder;

/**
 * StringBuilder를 써야 할 상황
 * 반복문에서 반복해서 문자를 연결할때
 * 조건문을 통해 동적으로 문자열 조합할때
 * 복잡한 문자열의 특정부분을 변경할때
 */
public class LoopStringBuilderMain {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 100000; i++) {
            sb.append("Hello Universe");
        }
        long endTime = System.currentTimeMillis();

        String result = sb.toString();
        System.out.println("result = " + result);
        System.out.println("time =  " + (endTime - startTime) + "ms");
    }
}
