import java.util.ArrayList;
import java.util.List;

public class ChooseCar {

    private List<Car> cars;

    public ChooseCar(List<Car> cars) {
        this.cars = cars;
    }

    public static List<Car> chooseByCompany(String company, List<Car> cars) {
        List<Car> result = new ArrayList<>();
        for (Car car:cars) {
            if(car.getCompany().equals(company)){
                result.add(car);
            }
        }
        return result;
    }

    public static List<Car> chooseByModelAndYearOfExpluatation(String model, int yearsOfExpluatation, List<Car> cars) {
        List<Car> result = new ArrayList<>();
        for (Car car:cars) {
            if(car.getModel().equals(model) && car.getYearsOfExpluatation()==yearsOfExpluatation){
                result.add(car);
            }
        }
        return result;
    }

    public static List<Car> chooseByYearAndPrice(int year, int price, List<Car> cars) {
        List<Car> result = new ArrayList<>();
        for (Car car:cars) {
            if(car.getYearOfCreation()==year && car.getPrice()>price){
                result.add(car);
            }
        }
        return result;
    }

}