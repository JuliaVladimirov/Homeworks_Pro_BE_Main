package org.example.homework_2024_01_30.calendar;

public enum Months {
    JANUARY("Январь"),
    FEBRUARY("Февраль"),
    MARCH("Март"),
    APRIL("Апрель"),
    MAY("Май"),
    JUNE("Июнь"),
    JULY("Июль"),
    AUGUST("Август"),
    SEPTEMBER("Сентябрь"),
    OCTOBER("Октябрь"),
    NOVEMBER("Ноябрь"),
    DECEMBER("Декабрь");

    private String title;

    Months(String title) {
        this.title = title;
    }

    Months() {
    }

    @Override
    public String toString() {
        return "Month: " + super.toString() + " - " + title;
    }

    public void drinkRight() {
        switch (this) {
            case DECEMBER:
            case JANUARY:
            case FEBRUARY:
                System.out.println("Зима, холода... Пейте горячий шоколад с маршмелками!");
                break;
            case MARCH:
            case APRIL:
            case MAY:
                System.out.println("Пришла весна! Пейте зеленый чай!");
                break;
            case JUNE:
            case JULY:
            case AUGUST:
                System.out.println("Лето в самом разгаре! Пейте апельсиновый сок!");
                break;
            default:
                System.out.println("Наступила осень! Пейте фруктовый чай с печеньками!");
        }

    }

    public void eatRight() {
        switch (this) {
            case JANUARY -> System.out.println(title + ": Приводим себя в форму, включите в свой рацион побольше брокколи и салата.");
            case FEBRUARY -> System.out.println(title + ": На улице все еще зима, перловая каша согреет вас и даст энергии.");
            case MARCH -> System.out.println(title + ": Первый месяц весны, салаты из пророщенных злаков - то, что нужно!");
            case APRIL -> System.out.println(title + ": Весенний авитаминоз, ешьте побольше цитрусовых.");
            case MAY -> System.out.println(title + ": В магазинах появилась первая зелень и редиска, включите их в свой рацион.");
            case JUNE -> System.out.println(title + ": Все на пикник! Мангал, мясо и хорошая компания - все, что вам нужно!");
            case JULY -> System.out.println(title + ": Собираем первый урожай. Помидоры, огурцы, перцы - всё в салат!");
            case AUGUST -> System.out.println(title + ": Изобилие овощей и фруктов. Набираемся витаминов на целый год!");
            case SEPTEMBER -> System.out.println(title + ": Капуста, свекла, морковь будут хорошим дополнением к вашему основному рациону.");
            case OCTOBER -> System.out.println(title + ": Картошка в это время года даст дополнительные витамины и энергию.");
            case NOVEMBER -> System.out.println(title + ": Переходите на супы! Ваш желудок скажет 'Спасибо!'.");
            default -> System.out.println(title + ": Сейчас зима! Чтобы не замерзнуть нужно есть сытные блюда.");
        }


    }
}


