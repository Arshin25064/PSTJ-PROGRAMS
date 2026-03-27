import java.util.*;

class Vehicle {
    int vehicleId;
    String modelName;
    double baseRent;

    Vehicle(int vehicleId, String modelName, double baseRent) {
        this.vehicleId = vehicleId;
        this.modelName = modelName;
        this.baseRent = baseRent;
    }

    double calculateRent() {
        return baseRent;
    }
}

class Car extends Vehicle {
    int seats;

    Car(int vehicleId, String modelName, double baseRent, int seats) {
        super(vehicleId, modelName, baseRent);
        this.seats = seats;
    }

    @Override
    double calculateRent() {
        return baseRent + (seats * 100);
    }
}

class Bike extends Vehicle {
    int engineCapacity;

    Bike(int vehicleId, String modelName, double baseRent, int engineCapacity) {
        super(vehicleId, modelName, baseRent);
        this.engineCapacity = engineCapacity;
    }

    @Override
    double calculateRent() {
        return baseRent + (engineCapacity * 2);
    }
}

public class TASK_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        List<Vehicle> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            char type = sc.next().charAt(0);

            int id = sc.nextInt();
            String model = sc.next();
            double baseRent = sc.nextDouble();

            if (type == 'C') {
                int seats = sc.nextInt();
                list.add(new Car(id, model, baseRent, seats));
            } else if (type == 'B') {
                int engine = sc.nextInt();
                list.add(new Bike(id, model, baseRent, engine));
            }
        }

        for (Vehicle v : list) {
            System.out.println(
                "Vehicle ID: " + v.vehicleId +
                ", Model: " + v.modelName +
                ", Total Rent: " + v.calculateRent()
            );
        }
    }
}