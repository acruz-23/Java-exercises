package org.example;

public class House extends Asset{

    private String address;
    private int condition, squareFoot, lotSize;
    public House(String description, String dateAquired, double originalCost, String address, int condition, int squareFoot, int lotSize) {
        super(description, dateAquired, originalCost);
        this.address = address;
        this.condition = condition;
        this.lotSize = lotSize;
        this.squareFoot = squareFoot;
    }

    public double getValue(){
        double value = 0.25 * lotSize;
        switch (this.condition){
            case 1:
                value += 180.0 * this.squareFoot;
                break;
            case 2:
                value += 130.0 * this.squareFoot;
                break;
            case 3:
                value += 90.0 * this.squareFoot;
                break;
            case 4:
                value += 80 * this.squareFoot;
                break;
            default:
                System.out.println("Please enter correct house condition code.");
                value = 0.00;
                break;
        }
        return value;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCondition() {
        return condition;
    }

    public void setCondition(int condition) {
        this.condition = condition;
    }

    public int getSquareFoot() {
        return squareFoot;
    }

    public void setSquareFoot(int squareFoot) {
        this.squareFoot = squareFoot;
    }

    public int getLotSize() {
        return lotSize;
    }

    public void setLotSize(int lotSize) {
        this.lotSize = lotSize;
    }
}
