package lang.string.chaining;

/**
 * 반환된 참조값 this를 연결해서 메소드를 호출한다.
 */
public class MethodChainingMain3 {
    public static void main(String[] args) {
        ValueAdder adder = new ValueAdder();
        int result = adder.add(1).add(2).add(3).getVal();

        System.out.println("result = " + result);
    }
}
