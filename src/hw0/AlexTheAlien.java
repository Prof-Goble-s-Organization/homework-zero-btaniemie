package hw0;

public class AlexTheAlien extends SpaceAlien implements ZapsWithSlime {
    private String planetType;

    public AlexTheAlien(String homePlanet, double distanceFromEarth, String planetType) {
        super(homePlanet, distanceFromEarth);
        this.planetType = planetType;
    }

    @Override
    public void doGreeting() {
        super.doGreeting();
        System.out.println("This alien is from a " + planetType);
    }

    @Override
    public String doSlimeZap(int numHumans) {
        if (numHumans < 1000) {
            return "blob blob";
        } else if (numHumans < 10000) {
            return "womp womp";
        } else {
            return "blob blob womp womp weeewooooo abracadabra";
        }
        
    }

    @Override
    public String slimeWholeEarth() {
        return "wubba lubba dub dub";
    }
    public static void main(String[] args) {
        AlexTheAlien Alexa = new AlexTheAlien("Kepler-22b", 587.1, "super Earth exoplanet");
        Alexa.doGreeting();
        System.out.println(Alexa.doSlimeZap(100));
        System.out.println(Alexa.doSlimeZap(5000));
        System.out.println(Alexa.doSlimeZap(70000));
        System.out.println(Alexa.slimeWholeEarth());
    }
    
}
