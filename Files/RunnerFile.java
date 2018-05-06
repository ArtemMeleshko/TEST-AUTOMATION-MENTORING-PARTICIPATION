

import by.epam.task2.appliences.Appliances;
import by.epam.task2.appliences.Electricical;
import by.epam.task2.appliences.EnumAppliances;
import by.epam.task2.homeAppliances.Blender;



import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RunnerFile {

    private static final String PATH = "G:\\!AT\\new.txt";

    public static void main(String[] args) {


        double powerConsumption;
        String YorN;
        Scanner in = new Scanner(System.in);


        Blender bl = new Blender("Blender", 150.5);

        bl.setTurnedOn();


        System.out.println("Written to file: ");
        System.out.println(bl.getName() + " " + bl.getPowerConsumption());
        writeToFile(bl);

        System.out.println("Read from file: ");
        Blender blFromFile = readFromFile();
        System.out.println(blFromFile.getName() + " " + blFromFile.getPowerConsumption());

    }

    private static Blender readFromFile() {
        Blender bl = new Blender("Blender",150.5);

        File file = new File(PATH);

        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (Exception e) {
                System.out.println("Error creating file.");
                System.exit(0);
            }
        }
        try {
            FileReader fr = new FileReader(file.getAbsoluteFile());
            BufferedReader br = new BufferedReader(fr);
            String line = br.readLine();
            br.close();
            return readBlenderFromLine(line);
        } catch (Exception e) {
            System.out.println("Error creating file.");
            System.exit(0);
        }

        return bl;
    }

    private static void writeToFile(Blender bl) {
        File file = new File(PATH);
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (Exception e) {
                System.out.println("Error creating file.");
                System.exit(0);
            }
        }
        try {
            FileWriter fw = new FileWriter(file.getAbsoluteFile());
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(bl.getName() + " " + bl.getPowerConsumption());
            bw.close();
        } catch (Exception e) {
            System.out.println("Error creating file.");
            System.exit(0);
        }
    }

    private static Blender readBlenderFromLine(String line) {
        String[] blParameters = new String[0];
        try {
            blParameters = line.split("\\s+");
        } catch (Exception e) {
            System.out.println("Error occurred. ");
        }
        return new Blender(blParameters[0],Double.parseDouble(blParameters[1]));
    }
}





