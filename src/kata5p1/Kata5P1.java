package kata5p1;

import java.util.List;

public class Kata5P1 {

    public static void main(String[] args) {
        List<String> mailList = MailListReader.read("email.txt");

        InsertarDatosTabla idt = new InsertarDatosTabla();
        idt.insert(mailList);
    }
}