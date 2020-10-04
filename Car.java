public class Car {
    private long id;
    private String company;
    private String model;
    private int yearOfCreation;
    private int yearsOfExpluatation;
    private String color;
    private int price;
    private String registerNumber;

    public Car(long id, String company, String model, int yearOfCreation, int yearsOfExpluatation, String color, int price, String registerNumber) {
        this.id = id;
        this.company = company;
        this.model = model;
        this.yearOfCreation = yearOfCreation;
        this.yearsOfExpluatation = yearsOfExpluatation;
        this.color = color;
        this.price = price;
        this.registerNumber = registerNumber;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYearOfCreation() {
        return yearOfCreation;
    }

    public void setYearOfCreation(int yearOfCreation) {
        this.yearOfCreation = yearOfCreation;
    }

    public int getYearsOfExpluatation() {
        return yearsOfExpluatation;
    }

    public void setYearsOfExpluatation(int yearsOfExpluatation) {
        this.yearsOfExpluatation = yearsOfExpluatation;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getRegisterNumber() {
        return registerNumber;
    }

    public void setRegisterNumber(String registerNumber) {
        this.registerNumber = registerNumber;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", company='" + company + '\'' +
                ", model='" + model + '\'' +
                ", yearOfCreation=" + yearOfCreation +
                ", yearsOfExpluatation=" + yearsOfExpluatation +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", registerNumber='" + registerNumber + '\'' +
                '}';
    }
}