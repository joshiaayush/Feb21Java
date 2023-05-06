package string;
//Difference between String, StringBuffer, StringBuilder
public class StringBufferAndStringBuilder {
    public static void main(String[] args) {
        String str = "Pune";
        StringBuilder sb = new StringBuilder(str);
        sb.append(" Mumbai");
        sb.delete(2,3);
        sb.replace(1,3,"S");
        sb.reverse();
        System.out.println(sb);

        StringBuffer bf = new StringBuffer(str);
        bf.append(" Mumbai");
        bf.deleteCharAt(2);
        bf.replace(1,3,"S");
        System.out.println(bf);

    }
}
