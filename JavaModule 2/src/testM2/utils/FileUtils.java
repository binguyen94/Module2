package testM2.utils;

import codegym.config.Config;
import codegym.model.Customer;
import codegym.model.Product;
import testM2.view.ERole;
import testM2.view.Egender;
import testM2.view.User;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FileUtils {
    public static <T> List<T> readFile(String path) {
        List<T> datas = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(path);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                String [] items = line.split(",");
                int id = Integer.parseInt(items[0]);
                LocalDate d = LocalDate.parse(items[5], DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                User user = new User(id,items[1],items[2], Egender.valueOf(items[3]), ERole.valueOf(items[4]),d);
                datas.add((T) user);
                }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return datas;
    }

    public static <T> void writeFile(String path, List<T> datas) {
        try {
            FileWriter fileWriter = new FileWriter(path);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (T p : datas) {
                bufferedWriter.write(p.toString());
            }
            bufferedWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
