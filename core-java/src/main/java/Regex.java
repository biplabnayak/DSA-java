import java.util.regex.Pattern;

public class Regex {

    public static void main(String[] args) {

        String s = "{\n" +
                "   \"files\":[\n" +
                "      {\n" +
                "         \"body\":\"xyz\",\n" +
                "         \"type\":\"zz\"\n" +
                "      },\n" +
                "      {\n" +
                "         \"body\":\"xyz\",\n" +
                "         \"type\":\"zz\"\n" +
                "      }\n" +
                "   ]\n" +
                "}";

        s = replaceBetweenWithoutRegex(s, "\"body\":", ",", false, false, "\"---CLIPPED---\"");
        System.out.println(s);
    }

    public static String replaceBetweenWithoutRegex(String str,
                                                    String start, String end,
                                                    boolean startInclusive,
                                                    boolean endInclusive,
                                                    String replaceWith) {
        start = Pattern.quote(start);
        end = Pattern.quote(end);
        return str.replaceAll("(" + start + ")" + ".*" + "(" + end + ")",
                ("$1") + replaceWith + ("$2"));
    }
}
