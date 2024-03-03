package org.example.task1;

//  1)  Есть Map, в котором хранится количество жителей по разным городам.
//      - Найдите город с самым большим количеством жителей.
//      - Найдите среднее количество жителей по всем городам.
//      - Найдите все города, у которых количество жителей одинаковое.

import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        Map<String, Integer> inhabitants = new HashMap<>();
        inhabitants.put("Berlin", 3576873);
        inhabitants.put("Paris", 2206488);
        inhabitants.put("Vienna", 1990000);
        inhabitants.put("Rome", 4316000);
        inhabitants.put("London", 9748033);
        inhabitants.put("Warsaw", 1799451);
        inhabitants.put("Madrid", 3340176);
        inhabitants.put("Prague", 1327947);
        inhabitants.put("Athens", 3154591);
        inhabitants.put("Zurich", 1443000);
        inhabitants.put("Milan", 1443000);
        System.out.println(inhabitants);
        System.out.println();
        System.out.println("The city with maximum inhabitants is:");
        System.out.println(getMax(inhabitants));
        System.out.println();
        System.out.println("The average amount of inhabitants is:");
        System.out.println(getAverage(inhabitants));
        System.out.println();
        System.out.println("The following cities have the same amount of inhabitants.");
        System.out.println(getSame(inhabitants));

    }

    public static Map.Entry<String, Integer> getMax(Map<String, Integer> inhabitants) {
        List<Map.Entry<String, Integer>> inhabitantsList = new ArrayList(inhabitants.entrySet());
        Collections.sort(inhabitantsList, new Comparator<Map.Entry<String, Integer>>() {

            public int compare(Map.Entry<String, Integer> entry1, Map.Entry<String, Integer> entry2) {
                if (entry1.getValue() == entry2.getValue()) {
                    return 0;
                } else if (entry1.getValue() > entry2.getValue()) {
                    return -1;
                } else {
                    return 1;
                }
            }
        });
        return inhabitantsList.get(0);
    }

    public static int getAverage(Map<String, Integer> inhabitants) {
        int sum = 0;
        for (Map.Entry<String, Integer> entry : inhabitants.entrySet()) {
            sum += entry.getValue();
        }
        return sum / inhabitants.size();
    }

    public static List<Map.Entry<String, Integer>> getSame(Map<String, Integer> inhabitants) {
        List<Map.Entry<String, Integer>> inhabitantsList = new ArrayList(inhabitants.entrySet());
        Collections.sort(inhabitantsList, new Comparator<Map.Entry<String, Integer>>() {

            public int compare(Map.Entry<String, Integer> entry1, Map.Entry<String, Integer> entry2) {
                if (entry1.getValue().equals(entry2.getValue())) {
                    return 0;
                } else if (entry1.getValue() < entry2.getValue()) {
                    return -1;
                } else {
                    return 1;
                }
            }
        });

        List<Map.Entry<String, Integer>> sameList = new ArrayList();

            for (int i = 1; i < inhabitantsList.size(); i++) {

                if (inhabitantsList.get(i - 1).getValue().equals(inhabitantsList.get(i).getValue())) {
                    sameList.add(inhabitantsList.get(i-1));
                    sameList.add(inhabitantsList.get(i));
                }
            }
            if (sameList.isEmpty()){
                System.out.println("There are no matches");
            }
        return sameList;
    }
}




