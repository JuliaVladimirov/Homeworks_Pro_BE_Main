package org.example.homework_2024_02_22.task3;

import java.util.Comparator;

public class RushHourComparator implements Comparator<Transport> {

    @Override
    public int compare(Transport transport1, Transport transport2) {
        if (transport1.getTransportTypes().equals(TransportTypes.AMBULANCE)){
            transport1.setPriorityLevel(1);
        } else if (transport2.getTransportTypes().equals(TransportTypes.AMBULANCE)){
            transport2.setPriorityLevel(1);
        }
        if (transport1.getTransportTypes().equals(TransportTypes.BUS)){
            transport1.setPriorityLevel(2);
        } else if (transport2.getTransportTypes().equals(TransportTypes.BUS)){
            transport2.setPriorityLevel(2);
        }

        if (transport1.getPriorityLevel() == transport2.getPriorityLevel()) {
            return 0;
        } else if (transport1.getPriorityLevel() < transport2.getPriorityLevel()) {
            return -1;
        } else {
            return 1;
        }
    }
}