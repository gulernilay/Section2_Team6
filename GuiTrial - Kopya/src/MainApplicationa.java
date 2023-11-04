
import com.google.gson.Gson;

import javax.swing.*;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MainApplicationa {
    public static void main(String[] args) {
        CourseInformationx c1v1 = new CourseInformationx("Yazılımın İlkeleri", "SE302", 3, 2, 5, 6);
        System.out.println(c1v1+"gvdfg\n");
        Gson gson = new Gson();

        // Convert to Json from the code
        String myJson = gson.toJson(c1v1);
        System.out.println("Json eklendi mi kontrol et listene: " + myJson+"\n");

        // Write to file
        try (FileWriter writer = new FileWriter("courseinformation1.json")) {
            gson.toJson(c1v1, writer); // Düzeltme: c1v1 nesnesini writer'a yazmalısınız.
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // Read from a json file
        try {
            FileReader reader = new FileReader("courseinformation1.json");
            CourseInformationx c1v1a = gson.fromJson(reader, CourseInformationx.class);
            System.out.println("Dosyadan okudum: " + c1v1);

            // Aşağıdaki kod, GuiDesign sınıfındaki JTextField'lere verileri yerleştirir
            SwingUtilities.invokeLater(() -> {
                GuiDesign guiDesign = new GuiDesign();
                guiDesign.textField1.setText(c1v1a.getCourseName());
                // Diğer JTextField'lere de aynı şekilde verileri yerleştirin
            });
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}