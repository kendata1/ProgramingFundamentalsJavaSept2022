package ObjectAndClassesExercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P05_VehicleCatalogue {
    static class Vehicle {
        private String type;
        private String model;
        private String color;
        private int horsepower;

        public Vehicle(String type, String model, String color, int horsepower) {
            this.type = type;
            this.model = model;
            this.color = color;
            this.horsepower = horsepower;
        }

        public String getModel() {
            return model;
        }

        public String getType() {
            return type;
        }

        public String getColor() {
            return color;
        }

        public int getHorsepower() {
            return horsepower;
        }

        @Override
        public String toString() {
            String formattedType = "";
            if (this.type.equals("car")){
                formattedType = "Car";
            } else  if (this.type.equals("truck")){
                formattedType = "Truck";
            }

            return String.format("Type: %s%nModel: %s%nColor: %s%nHorsepower: %d%n", formattedType, this.model, this.color, this.horsepower);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        List<Vehicle> vehicleList = new ArrayList<>();

        int carsHorsePowerSum = 0;
        double carsCount = 0;

        int trucksHorsepowerSum = 0;
        double trucksCount = 0;


        while (!input.equals("End")){
            String [] vehicleDataArr = input.split(" ");

            String type = vehicleDataArr [0];
            String model = vehicleDataArr [1];
            String color = vehicleDataArr [2];
            int horsepower = Integer.parseInt(vehicleDataArr[3]);

            Vehicle currentVehicle = new Vehicle(type,model,color,horsepower);
            vehicleList.add(currentVehicle);

            switch (type){
                case "car":
                    carsHorsePowerSum += horsepower;
                    carsCount ++;
                    break;
                case "truck":
                    trucksHorsepowerSum += horsepower;
                    trucksCount ++;
                    break;
            }

            input = scanner.nextLine();
        }

        String models = scanner.nextLine();
        while (!models.equals("Close the Catalogue")){
            for (Vehicle item : vehicleList){
                if (models.equals(item.getModel())){
                    System.out.println(item);
                }
            }
            models = scanner.nextLine();
        }
        double carsAverageHorsepower = carsHorsePowerSum / carsCount;
        double trucksAverageHorsepower = trucksHorsepowerSum / trucksCount;

        if (carsHorsePowerSum == 0){
            System.out.println("Cars have average horsepower of: 0.00.");
        } else {
            System.out.printf("Cars have average horsepower of: %.2f.%n", carsAverageHorsepower);
        }

        if (trucksHorsepowerSum == 0) {
            System.out.println("Trucks have average horsepower of: 0.00.");
        } else {
            System.out.printf("Trucks have average horsepower of: %.2f.", trucksAverageHorsepower);
        }
    }
}
