class Vehicle {
    protected String brand;
    protected String model;

    public Vehicle(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }
}

class Car extends Vehicle {
    private int numberOfDoors;

    public Car(String brand, String model, int numberOfDoors) {
        super(brand, model);
        this.numberOfDoors = numberOfDoors;
    }
}


abstract class WorkTool {
    protected String name;
    protected int productionYear;

    public WorkTool(String name, int productionYear) {
        this.name = name;
        this.productionYear = productionYear;
    }

    public abstract void use();
}

class Hammer extends WorkTool {
    public Hammer(String name, int productionYear) {
        super(name, productionYear);
    }

    @Override
    public void use() {
        System.out.println("Hammering!");
    }
}

class Screwdriver extends WorkTool {
    public Screwdriver(String name, int productionYear) {
        super(name, productionYear);
    }

    @Override
    public void use() {
        System.out.println("Screwing!");
    }
}

class Saw extends WorkTool {
    public Saw(String name, int productionYear) {
        super(name, productionYear);
    }

    @Override
    public void use() {
        System.out.println("Sawing!");
    }
}


interface Sensor {
    double readValue();
    String getStatus();
    void reset();
}

class TemperatureSensor implements Sensor {
    @Override
    public double readValue() {
        return 22.5;  // Example value
    }

    @Override
    public String getStatus() {
        return "Temperature Sensor is active";
    }

    @Override
    public void reset() {
        System.out.println("Temperature Sensor reset");
    }
}

class PressureSensor implements Sensor {
    @Override
    public double readValue() {
        return 101.3;  // Example value
    }

    @Override
    public String getStatus() {
        return "Pressure Sensor is active";
    }

    @Override
    public void reset() {
        System.out.println("Pressure Sensor reset");
    }
}


class Triple<T, U, V> {
    private T first;
    private U second;
    private V third;

    public Triple(T first, U second, V third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public T getFirst() {
        return first;
    }

    public U getSecond() {
        return second;
    }

    public V getThird() {
        return third;
    }
}


interface Converter {
    double convertToEuro(double amount);
    double convertToUSD(double amount);
    double getConversionRate(String currency);
}

class CurrencyConverter implements Converter {
    @Override
    public double convertToEuro(double amount) {
        return amount * 0.85;  // Example rate
    }

    @Override
    public double convertToUSD(double amount) {
        return amount * 1.1;  // Example rate
    }

    @Override
    public double getConversionRate(String currency) {
        // Example implementation
        if (currency.equals("USD")) {
            return 1.1;
        } else if (currency.equals("EUR")) {
            return 0.85;
        }
        return 1.0;
    }
}

class UnitConverter implements Converter {
    @Override
    public double convertToEuro(double amount) {
        return amount / 100;  // Example conversion for units
    }

    @Override
    public double convertToUSD(double amount) {
        return amount / 90;  // Example conversion for units
    }

    @Override
    public double getConversionRate(String currency) {
        return 1.0;  // Example placeholder
    }
}


public class Utility {
    public static <T> boolean isEqualOrNull(T object1, T object2) {
        if (object1 == null && object2 == null) {
            return true;
        } else if (object1 == null || object2 == null) {
            return false;
        } else {
            return object1.equals(object2);
        }
    }
}
