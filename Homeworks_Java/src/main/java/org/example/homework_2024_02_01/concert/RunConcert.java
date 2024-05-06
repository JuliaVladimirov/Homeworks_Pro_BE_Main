package org.example.homework_2024_02_01.concert;

public class RunConcert {
    public static void main(String[] args) {
        Concert<Actor> actorOnStage = new Concert<>(new Actor("Julia Roberts"));
        actorOnStage.artist.perform();

        Concert<Dancer> dancerOnStage = new Concert<>(new Dancer("Anna Pavlova"));
        dancerOnStage.artist.perform();

        Concert<Musician> musicianOnStage = new Concert<>(new Musician("Richard Clayderman"));
        musicianOnStage.artist.perform();

        Concert<Singer> singerConcert = new Concert<>(new Singer("Michael Jackson"));
        singerConcert.artist.perform();



    }
}
//       3. Вы владелец концертного зала со сценой.
//       Вы нанимаете артистов различного жанра, которые развлекают зрителей, используя свои таланты.
//       Реализуйте класс Концерт, в котором разные артисты будут выходить на сцену и развлекать зрителей используя свои умения и талант.
//       Подумайте, можно для класса Концерт применить Generiс подход к реализации?


