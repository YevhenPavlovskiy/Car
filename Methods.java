
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        List<Car> car = new ArrayList<>();
        car.add(new Car(1414124, "Mersedes", "ML-240",2000, 4,"Purple", 12000, "AM231"));
        car.add(new Car(8765433, "Deo", "Lanos", 2005,2,"White", 2000, "AM121"));
        car.add(new Car(1231314, "Toyota", "Prado", 2018, 1,"Black", 60000, "AM931"));
        car.add(new Car(7868672, "Mersedes", "AM-130", 2010, 0,"Purple", 24000, "AM321"));
        car.add(new Car(6546546, "Deo", "Matis",2010, 7,"Red", 3000, "AM231"));
        car.add(new Car(2352342, "Mersedes", "ML-240", 2019,15,"Black", 12000, "AM342"));
        System.out.println(ChooseCar.chooseByCompany("Deo", car));
        System.out.println(ChooseCar.chooseByModelAndYearOfExpluatation("ML-240", 4, car));
        System.out.println(ChooseCar.chooseByYearAndPrice(2000, 120, car));

    }


}