package lang.string.builder;

/**
 * 메소드 체이닝 기법을 이용한 리팩토링
 */
public class StringBuilderMain1_2 {

    public static void main(String[] args) {
        
        StringBuilder sb = new StringBuilder();
        String str = sb.append("S").append("E").append("X").append("Y")
                .insert(2, "Java")
                .delete(2,4)
                .reverse()
                .toString();
        System.out.println("str = " + str );
 
    }
}
