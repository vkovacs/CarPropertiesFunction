import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class MainTest {
    @Test
    public void testFunction() {
        List<Main.Car> cars = Arrays.asList(
                new Main.Car(1999, "blue"),
                new Main.Car(2000, "green"),
                new Main.Car(2001, "red")
        );
        System.out.println(Main.getProperties(cars, t -> t.year));
        System.out.println(Main.getProperties(cars, t-> t.color));
    }
}
