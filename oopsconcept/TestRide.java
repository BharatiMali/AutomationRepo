package oopsconcept;

public class TestRide {

    public static void main(String[] args) {
        RoyalEnfield y = new RoyalEnfield();
        y.start();
        y.stop();
        y.refuel();


        Bike r = new RoyalEnfield();
        {

            r.start();
            r.stop();
            r.refuel();
        }

    }
}

