public class SuperCar{
    private String colour, brand, ownerName;
    private int price;
    private static byte countInstance;

    private SuperCar() {

    }

    public static SuperCar getInstance(){
        if(countInstance==0){
            countInstance++;
            return new SuperCar();
        }
        return null;
    }
    public String getColour() {
        return colour;
    }

    public String getBrand() {
        return brand;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public int getPrice() {
        return price;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
