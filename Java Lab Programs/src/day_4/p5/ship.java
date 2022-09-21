package day_4.p5;

class ship {
    private String name, build_year;
 
    ship(String name, String build_year) {
        this.name = name;
        this.build_year = build_year;
    }
 
    public void setShipName(String name) {
        this.name = name;
    }
 
    public void setShipBuildYear(String build_year) {
        this.build_year = build_year;
    }
 
    public String getName() {
        return name;
    }
 
    public String getBuildYear() {
        return build_year;
    }
 
    public String toString() {
        return "ship [Name=" + name + ", Build Year=" + build_year + "]";
    }
 
}
 
class cruiseShip extends ship {
    private int maxPassenger;
 
    cruiseShip(String name, String buildYr, int maxPassenger) {
        super(name, buildYr);
        this.maxPassenger = maxPassenger;
    }
 
    public void setMaxPassenger(int maxPassenger) {
        this.maxPassenger = maxPassenger;
    }
 
    public int getMaxPassenger() {
        return maxPassenger;
    }
 
    @Override
    public String toString() {
        return "CruiseShip[Name=" + super.getName() + ", Maximum Passenger=" + maxPassenger + "]";
    }
}
 
class CargoShip extends ship {
    private int capacity;
 
    CargoShip(String name, String buildYr, int capacity) {
        super(name, buildYr);
        this.capacity = capacity;
    }
 
    public int getCapacity() {
        return capacity;
    }
 
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
 
    @Override
    public String toString() {
        return "CargoShip [" + "Name=" + super.getName() + ", capacity=" + capacity + "tonnage]";
    }
}
