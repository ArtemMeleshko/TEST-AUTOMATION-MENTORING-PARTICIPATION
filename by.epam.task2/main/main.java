package by.epam.task2.main;

import by.epam.task2.appliences.Appliances;
import by.epam.task2.appliences.Electricical;
import by.epam.task2.appliences.EnumAppliances;
import by.epam.task2.homeAppliances.AirConditioner;
import by.epam.task2.homeAppliances.Blender;
import by.epam.task2.homeAppliances.VacuumCleaner;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double powerConsumption;
        String YorN;
        Scanner in = new Scanner(System.in);


        Blender bl1 = new Blender("Blender", 150.5, EnumAppliances.Blender, true);
        Blender bl2 = new Blender("Blender1", 144.3, EnumAppliances.Blender, false);
        VacuumCleaner vac = new VacuumCleaner("VacuumCleaner", 255.3, EnumAppliances.VacuumCleaner, true);
        AirConditioner air1 = new AirConditioner("AirConditioner1", 147.2, EnumAppliances.AirConditioner, true);
        AirConditioner air2 = new AirConditioner("AirConditioner1", 120, EnumAppliances.AirConditioner, true);

        bl1.setTurnedOn();
        vac.setTurnedOn();
        bl1.setTurnedOn();
        air2.setTurnedOn();

        System.out.println("Appliances in electrical network:");
        Electricical.printAppliancesTurnedOn();
        System.out.println("Total power consumption of turned on appliences = " + Electricical.sumPower());

        System.out.println("\nAll appliances sorted by power:");
        Electricical.sortByPowerConsumption();
        Electricical.printAllApliances();

        System.out.println("\nDo you want to sort the appliences by power? Y/N");

        YorN = in.next();
        if (YorN.equals("Y")) {

            System.out.println("\nEnter a power. NOTES: Min power is 120");
            powerConsumption = in.nextDouble();
            System.out.println("\nAppliances with the power less than " + powerConsumption + "\n" + Electricical.findByParameter(powerConsumption));

        } else
            System.out.println("thanks");
    }

}
