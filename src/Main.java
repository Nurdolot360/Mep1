import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Main {
    public static void main(String[] args){

        Map<Car, MachineData> carMap = new HashMap<>();

        Car car1 = new Car(1, "04 444 GGG");
        MachineData carData1 = new MachineData(2021, "Tayota Camry", "35000 $", "Blue");
        carMap.put(car1, carData1);

        Car car2 = new Car(2, "09 999 NUR");
        MachineData carData2 = new MachineData(2022, "Volkmest", "21000 $", "Red");
        carMap.put(car2, carData2);

        for (Map.Entry<Car, MachineData> entry : carMap.entrySet()) {
            System.out.println("Car: " + entry.getKey().getNumberAuto() + "\n" + " Year: " +
                    entry.getValue().getYearOfManufacture()
                    + "\n" + " Model: " + entry.getValue().getModel() + "\n" + " Price: " +
                    entry.getValue().getPrice()
                    + "\n" + " Color: " + entry.getValue().getColor());
        }


    }
}