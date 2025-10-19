// Base class for all animals
abstract class Animal {
    protected String name;
    protected double typicalSize;
    protected double typicalWeight;
    protected boolean isPredator;

    public Animal(String name, double typicalSize, double typicalWeight, boolean isPredator) {
        this.name = name;
        this.typicalSize = typicalSize;
        this.typicalWeight = typicalWeight;
        this.isPredator = isPredator;
    }

    // Abstract method
    abstract void displayInfo();
    protected void displayCommonInfo() {
        System.out.println("Name: " + name);
        System.out.println("Typical Size: " + typicalSize + " meters");
        System.out.println("Typical Weight: " + typicalWeight + " kg");
        System.out.println("Diet: " + (isPredator ? "Predator" : "Vegetarian"));
    }

}

// Bird class
class Bird extends Animal {
    private String speciesName;
    private double wingspan;
    private boolean canFly;

    public Bird(String name, double typicalSize, double typicalWeight, boolean isPredator, 
                String speciesName, double wingspan, boolean canFly) {
    super(name, typicalSize, typicalWeight, isPredator);
    this.speciesName = speciesName;
    this.wingspan = wingspan;
    this.canFly = canFly;
    }

    @Override
    void displayInfo() {
        System.out.println("\n=== Bird ===");
        displayCommonInfo();
        System.out.println("Species: " + speciesName);
        System.out.println("Wingspan: " + wingspan + " meters");
        System.out.println("Can fly: " + (canFly ? "Yes" : "No"));
    }
}
 // LandAnimal class
 class LandAnimal extends Animal {
    private String speciesName;
    private int numberOfLegs;
    private String habitat;

    public LandAnimal(String name, double typicalSize, double typicalWeight, boolean isPredator,
                     String speciesName, int numberOfLegs, String habitat) {
        super(name, typicalSize, typicalWeight, isPredator);
        this.speciesName = speciesName;
        this.numberOfLegs = numberOfLegs;
        this.habitat = habitat;
    }

    @Override
    void displayInfo() {
        System.out.println("\n=== Land Animal ===");
        displayCommonInfo();
        System.out.println("Species: " + speciesName);
        System.out.println("Number of Legs: " + numberOfLegs);
        System.out.println("Habitat: " + habitat);
    }
 }

 // Fish class
 class Fish extends Animal {
    private String speciesName;
    private int numberOfFins;
    private String waterType;

    public Fish(String name, double typicalSize, double typicalWeight, boolean isPredator,
                String speciesName, int numberOfFins, String waterType) {
        super(name, typicalSize, typicalWeight, isPredator);
        this.speciesName = speciesName;
        this.numberOfFins = numberOfFins;
        this.waterType = waterType;
    }

    @Override
    void displayInfo(){
        System.out.println("\n=== Fish ===");
        displayCommonInfo();
        System.out.println("Species: " + speciesName);
        System.out.println("Number of Fins: " + numberOfFins);
        System.out.println("Water Type: " + waterType);
    }

 }

public class Lab2 {
    public static void main(String[] args) {
        // Create bird instance
        Bird hummingbird = new Bird("Hummingbird", 0.1, 0.02, false,
        "Trochilidae", 0.12, true);

        // Create Land animal instance
        LandAnimal coyote = new LandAnimal("Coyote", 0.8, 15, true,
        "Canis latrans", 4, "Grassland");

        // Create fish instance
        Fish dolphin = new Fish("Dolphin", 2, 100, true,
         "Delphinidae", 4, "Saltwater");

        // Display all animals
        hummingbird.displayInfo();
        coyote.displayInfo();
        dolphin.displayInfo();



        
    }
    
}
