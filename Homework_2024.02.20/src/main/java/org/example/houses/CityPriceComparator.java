package org.example.houses;

import java.util.Comparator;

public class CityPriceComparator implements Comparator<House> {

    @Override
    public int compare(House house1, House house2) {
        if (house1.getCity().equals(house2.getCity())) {
            if (house1.getPrice() == house2.getPrice()) {
                return 0;
            } else if (house1.getPrice() < house2.getPrice()) {
                return -1;
            } else {
                return 1;
            }
        } else {
            return house1.getCity().compareTo(house2.getCity());
        }
    }
}
//      Но иногда клиент хочет видеть информацию о домах в конкретном городе и осортированную по цене.
//      Реализуйте компаратор, который вы можете применить для показа клиенту в требуемом им формате.