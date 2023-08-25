package transport;

public class Transport {
    private final String brand;
    private final String model;
    private final int productionYear;
    private final String productionCountry;
    private String color;
    private int maxSpeed;

    public Transport(String brand, String model, int productionYear, String productionCountry, String color, int maxSpeed) {
        this.brand = validOrDefault(brand, "default");
        this.model = validOrDefault(model, "не указана");
        this.productionCountry = validOrDefault(productionCountry, "не указана");
        this.productionYear = validOrDefault2(productionYear, 2000);
        setColor(color);
        setMaxSpeed(maxSpeed);
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public String getProductionCountry() {
        return productionCountry;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = validOrDefault(color, "white");
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = validOrDefault2(maxSpeed, 120);
    }

    private static String validOrDefault(String value, String defaultValue) {
        if (value == null || value.isBlank()) {
            return defaultValue;
        } else {
            return value;
        }
    }

    private int validOrDefault2(int value2, int defaultValue2) {
        return value2 > 0 ? value2 : defaultValue2;
    }

    @Override
    public String toString() {
        return brand + " " + model + ", " + productionYear + " года выпуска, сборка " + productionCountry +
                ", цвет " + color + ", максимальная скорость " + maxSpeed;
    }
}