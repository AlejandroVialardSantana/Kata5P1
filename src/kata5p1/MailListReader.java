package kata5p1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class MailListReader {

    public static List<String> read(String fileName){

        List<String> mailList = new ArrayList<>();
        Pattern pattern = Pattern.compile("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$");

        try {
            BufferedReader reader = new BufferedReader(new FileReader(new File(fileName)));

            while (true) {
                String line = reader.readLine();
                if (line == null) break;
                if (pattern.matcher(line).matches()) mailList.add(line);
            }  
        }
        catch(FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

        catch (IOException e) {
            System.out.println(e.getMessage());
        }

        return mailList;

    }
}