package by.epam.task2.appliences;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Electricical {
    private static List<Appliances> allAppliances = new ArrayList<>();
    private static List<Appliances> appliancesTurnedOn = new ArrayList<>();

    public static List<Appliances> getAllAppliances(){
        return allAppliances;
    }

    public static List<Appliances> getAppliencesTurnedOn(){
        return appliancesTurnedOn;
    }

    public static void printAllApliances(){
        for(Appliances allAppliances : allAppliances){
            System.out.println(allAppliances);
        }
    }

    public static void printAppliancesTurnedOn(){
        for(Appliances appliancesTurnedOn : appliancesTurnedOn){
            System.out.println(appliancesTurnedOn);
        }
    }

    public static void sortByPowerConsumption(){
        Collections.sort(allAppliances);
    }

    public static List <Appliances> findByParameter(Double powerConsumption){
        List<Appliances> sortResult = new ArrayList<>();
        for(Appliances appliances : allAppliances){
            if(appliances.getPowerConsumption() < powerConsumption)
                sortResult.add(appliances);
        }

        return sortResult;
    }

    public static double sumPower(){
        double sumPower = 0;
        for(Appliances appliances : appliancesTurnedOn ){
            sumPower += appliances.getPowerConsumption();
        }
        return sumPower;

    }

}
