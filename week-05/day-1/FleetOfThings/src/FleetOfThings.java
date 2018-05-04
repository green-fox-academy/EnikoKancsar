public class FleetOfThings {

    public static void main(String[] args) {
        Fleet fleet = new Fleet();

        Thing thing1 = new Thing("Get milk");
        fleet.add(thing1);

        Thing thing2 = new Thing("Remove the obstacles");
        fleet.add(thing2);

        Thing thing3 = new Thing("Stand up");
        thing3.complete();
        fleet.add(thing3);

        Thing thing4 = new Thing("Remove the obstacles");
        thing4.complete();
        fleet.add(thing4);

        System.out.println(fleet);
    }
}