package day_4.p5;

public class Main {
	public static void main(String[] args) {
        ship[] ships = new ship[3];
 
        ships[0] = new ship("Apex_104", "2021");
        ships[1] = (cruiseShip) new cruiseShip("Yono_103", "1999", 65);
        ships[2] = (CargoShip) new CargoShip("Moco_104", "2020", 104);
 
        for (ship i : ships) {
            System.out.println(i.toString());
        }
    }
}
