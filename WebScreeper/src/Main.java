import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String html = "\"<a href=\\\"mailto:joao@gmail.com\\\">\\n   joao@gmail.com  </a>\\n\" +\n" +
                "                \"<a>\\n   abc@algaworks.com</a><a>xyz@algaworks.com</a>\" +\n" +
                "                \"<strong>maria@algaworks.com</strong>\"";


        String regex = "<strong>(.*)</strong>";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(html);


        while (matcher.find()) {
            System.out.println(matcher.group(1));
        }
    }
}