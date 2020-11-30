package House;

import java.util.Objects;

public class House {

    private  int id;
    private  int apartNumber;
    private  double apartArea;
    private  int floor;
    private  int countOfRooms;
    private  String street;

    House()
    {

    }
    public House(int id, int apartNumber, double apartArea, int floor, int countOfRooms, String street) {
        this.id = id;
        this.apartNumber = apartNumber;
        this.apartArea = apartArea;
        this.floor = floor;
        this.countOfRooms = countOfRooms;
        this.street = street;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getApartNumber() {
        return apartNumber;
    }

    public void setApartNumber(int apartNumber) {
        this.apartNumber = apartNumber;
    }

    public double getApartArea() {
        return apartArea;
    }

    public void setApartArea(double apartArea) {
        this.apartArea = apartArea;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public int getCountOfRooms() {
        return countOfRooms;
    }

    public void setCountOfRooms(int countOfRooms) {
        this.countOfRooms = countOfRooms;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

@Override
    public  String toString()
    {
    return "House{"+"id="+id+", Aparatament Number="+apartNumber
            +", Appartament area="+apartArea
            +", Floor="+floor
            +", Count of rooms="+countOfRooms
            +", Street="+street+"}";
    }
    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        House house = (House) object;

        return id == house.id &&
                apartNumber == house.apartNumber &&
                apartArea == house.apartArea &&
                floor == house.floor &&
                countOfRooms==house.countOfRooms &&
                Objects.equals(street,house.street);

    }


}
