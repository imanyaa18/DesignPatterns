
interface Chair {
    void sitOn();
}

// Modern-style chair
class ModernChair implements Chair {

    @Override
    public void sitOn() {
        System.out.println("Sitting on a Modern Chair");
    }
}

// Victorian-style chair
class VictorianChair implements Chair {

    @Override
    public void sitOn() {
        System.out.println("Sitting on a Victorian Chair");
    }
}

// Abstract Factory interface
interface FurnitureFactory {
    Chair createChair();
}

// Factory for modern furniture
class ModernFurnitureFactory implements FurnitureFactory {

    @Override
    public Chair createChair() {
        return new ModernChair();
    }
}

// Factory for Victorian furniture
class VictorianFurnitureFactory implements FurnitureFactory {

    @Override
    public Chair createChair() {
        return new VictorianChair();
    }
}

// Main class
public class AbstractFactoryDemo {

    public static void main(String[] args) {

        // Create modern furniture
        FurnitureFactory modernFactory =
                new ModernFurnitureFactory();

        Chair modernChair = modernFactory.createChair();
        modernChair.sitOn();

        // Create Victorian furniture
        FurnitureFactory victorianFactory =
                new VictorianFurnitureFactory();

        Chair victorianChair =
                victorianFactory.createChair();

        victorianChair.sitOn();
    }
}
