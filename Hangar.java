public class Hangar {

    public static void main(String[] args) {

        Car bolide = new Car("Dacia sandero", 199880);
        System.out.println("1 - " + bolide.doStuff());

        Boat submarine = new Boat(" le sous-marin titan", 15);
        System.out.println("2 -" + submarine.doStuff());
        System.out.println("3 - mon kilométrage est de " + submarine.getKilometers() + " km") ;
    }
}