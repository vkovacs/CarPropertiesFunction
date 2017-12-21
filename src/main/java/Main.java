import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {

    public static class Car {
        public int year;
        public String color;

        Car(int year, String color) {
            this.year = year;
            this.color = color;
        }
    }

    static <T> List<T> getProperties(List<Car> cars, Function<Car, T> propertyFunction) {
        return cars.stream()
                .map(propertyFunction::apply)
                .collect(Collectors.toList());
    }
}
