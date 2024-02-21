package org.example.houses;

import java.util.Comparator;

public class CityAreaComparator implements Comparator<House> {

    @Override
    public int compare(House house1, House house2) {
        if (house1.getCity().equals(house2.getCity())) {
            if (house1.getArea() == house2.getArea()) {
                return 0;
            } else if (house1.getArea() < house2.getArea()) {
                return -1;
            } else {
                return 1;
            }
        } else {
            return house1.getCity().compareTo(house2.getCity());
        }
    }
}

//      А если клиенту неожиданно захочет увидеть информацию, отсортированную в формате:
//      "город - площадь дома", что вы будете делать?