package org.example.concert;

public class Concert {
    public static void main(String[] args) {

        Singer singer = new Singer();
        Artist<Singer> artist1 = new Artist<>("Michael Jackson", singer);
        artist1.perform();
        System.out.println("---------------------------------------------------------------------");

        Dancer dancer = new Dancer();
        Artist<Dancer> dancer1 = new Artist<>("Anna Pavlova", dancer);
        dancer1.perform();
        System.out.println("---------------------------------------------------------------------");

        Actor actor = new Actor();
        Artist<Actor> actor1 = new Artist<>("Julia Roberts", actor);
        actor1.perform();
        System.out.println("---------------------------------------------------------------------");

        Musician musician = new Musician();
        Artist<Musician> musician1 = new Artist<>("Richard Clayderman", musician);
        dancer1.perform();
        System.out.println("---------------------------------------------------------------------");

    }
}
//       3. Вы владелец концертного зала со сценой.
//       Вы нанимаете артистов различного жанра, которые развлекают зрителей, используя свои таланты.
//       Реализуйте класс Концерт, в котором разные артисты будут выходить на сцену и развлекать зрителей используя свои умения и талант.
//       Подумайте, можно для класса Концерт применить Generiс подход к реализации?
