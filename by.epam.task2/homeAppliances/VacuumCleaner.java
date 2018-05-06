package by.epam.task2.homeAppliances;

import by.epam.task2.appliences.Appliances;
import by.epam.task2.appliences.Electricical;
import by.epam.task2.appliences.EnumAppliances;

public class VacuumCleaner extends Appliances {


    public VacuumCleaner(String name, double powerConsumption, EnumAppliances enumAppliances, boolean isTurnedOn) {
        super(name, powerConsumption, enumAppliances, isTurnedOn);
        Electricical.getAllAppliances().add(this);
    }

    @Override
    public String toString() {
        return
                "name = " + getName() +
                        ", powerConsumption = " + getPowerConsumption() +
                        ", isTurnedOn=" + isTurnedOn();
    }
}
