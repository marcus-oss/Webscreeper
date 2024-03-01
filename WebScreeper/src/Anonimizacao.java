public class Anonimizacao {

    public static void main(String[] args) {
        String html = "\"<a href=\\\"mailto:joao@gmail.com\\\">\\n   joao@gmail.com  </a>\\n\" +\n" +
                "                \"<a>\\n   abc@algaworks.com</a><a>xyz@algaworks.com</a>\" +\n" +
                "                \"<strong>maria@algaworks.com</strong>\"";


        String regex = "[\\w.-]+@[a-z\\d.-]+\\.[a-z]{2,3}";
        String novoHTML = html.replaceAll(regex, "email@anonimo.com");

        System.out.println(novoHTML);

    }


}
