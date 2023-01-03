package kata5p1;

public class Kata5P1 {

    public static void main(String[] args) {
        String url = "jdbc:sqlite:email.db";

        CrearBD.createNewDataBase(url);
        CrearTabla.createNewTable(url);
    }
}