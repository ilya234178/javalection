import java.util.ArrayList;
import java.util.List;
public class Zoo {
    public List<Animal> getAnimals() {
        return animals;
    }

    private List<Animal> animals = new ArrayList<>();

    public Zoo addAnimal(Animal animal){
        animals.add(animal);
        return this;
    }

    @Override
    public String toString() {
        return "Zoo{" +
                "animals=" + animals +
                '}';
    }

    public String talk(){
        StringBuilder stringBuilder = new StringBuilder();
        for (Speakable item: getSpeakable()) {
            stringBuilder.append(item.speak() + "\n");
        }
        return stringBuilder.toString();
    }

    private List<Speakable> getSpeakable(){
        List<Speakable> result = new ArrayList<>();
        for (Animal item: animals) {
            if (item instanceof Speakable){
                result.add((Speakable) item);
            }
        }
        result.add(new Radio());
        return result;
    }
    public List<Runable> getRanable(){
        List<Runable> result = new ArrayList<>();
        for (Animal item: animals) {
            if (item instanceof Runable){
                result.add((Runable) item);
            }
        }
        return result;
    }
    public List<SwimmingSpeedable> getSwimmingSpeedable(){
        List<SwimmingSpeedable> result = new ArrayList<>();
        for (Animal item: animals) {
            if (item instanceof  SwimmingSpeedable){
                result.add((SwimmingSpeedable) item);
            }
        }
        return result;
    }

    public int getChampionRun(){
        int max = 0;
        for (Runable item: getRanable()) {
            if (item.runSpeed() > max){
                max = item.runSpeed();
            }
        }
        return max;
    }

    public int getChampionSwimming(){
        int max = 0;
        for (SwimmingSpeedable item: getSwimmingSpeedable()) {
            if (item.swimmingSpeed() > max){
                max = item.swimmingSpeed();
            }
        }
        return max;
    }

    public List<Flyable> getFlyable(){
        List<Flyable> flyables = new ArrayList<>();
        for (Animal item: animals) {
            if (item instanceof Flyable){
                flyables.add((Flyable) item);
            }

        }
        return flyables;
    }
}
