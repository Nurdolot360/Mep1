public class MachineData {
    private int yearOfManufacture;
    private String model;
    private String price;
    private String color;

    public MachineData() {
    }

    public MachineData(int yearOfManufacture, String model, String price, String color) {
        this.yearOfManufacture = yearOfManufacture;
        this.model = model;
        this.price = price;
        this.color = color;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

