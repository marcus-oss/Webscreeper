import java.util.Arrays;

public class Split {

    public static void main(String[] args) {
        String html = "Anonimo@outlook.com.br";
        String[] partes = html.split("@");

        System.out.println(Arrays.toString(partes));
        System.out.println(partes[0] +  " do " + partes[1]);
    }
}
