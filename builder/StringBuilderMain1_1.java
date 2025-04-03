package lang.string.builder;

/**
 * StringBuilder는 불변이 아니다
 */
public class StringBuilderMain1_1 {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();
        sb.append("S");
        sb.append("E");
        sb.append("X");
        sb.append("Y");
        System.out.println(" sb= " + sb);

        sb.insert(2,"JAVA");
        System.out.println("insert = " + sb);

        sb.delete(2,4);
        System.out.println("delete = " + sb);

        sb.reverse();
        System.out.println("revers = " + sb);

        //StringBuilder => String
        String str = sb.toString();
        System.out.println("Str = " + str);
    }
}
