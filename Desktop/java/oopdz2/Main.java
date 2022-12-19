public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        zoo.addAnimal(new Cat("Dimka", 4, "Oleg"))
                .addAnimal(new Dog("Tuzik", 4, "Petya"))
                .addAnimal(new Swan("Gosha", 2, "Vasilisa"))
                .addAnimal(new Duck("Donald", 2, "Ivan"))
                .addAnimal(new Eagle("Trut", 2, "Sasha"));
        System.out.println(zoo.toString());
        System.out.println(zoo.talk());
        System.out.println("Скорость бега");
        for (Runable i: zoo.getRanable()) {
            System.out.println(i.runSpeed());
        }

        System.out.println("Чемпион по бегу");
        System.out.println(zoo.getChampionRun());

        System.out.println("Скорость плавания");
        for (SwimmingSpeedable i: zoo.getSwimmingSpeedable()) {
            System.out.println(i.swimmingSpeed());
        }

        System.out.println("Чемпион по плаванию");
        System.out.println(zoo.getChampionSwimming());

        System.out.println("Скорость полета");
        for (Flyable i: zoo.getFlyable()) {
            System.out.println(i.flySpeed() );
        }

        SaveManagerAnimals saveManagerAnimals = new SaveManagerAnimals();
        saveManagerAnimals.save(zoo.getAnimals());

    }
}
