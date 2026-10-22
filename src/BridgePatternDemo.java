
interface TV {
    void turnOn();
    void turnOff();
}

// Concrete implementation 1
class LGTV implements TV {

    @Override
    public void turnOn() {
        System.out.println("LG TV is ON");
    }

    @Override
    public void turnOff() {
        System.out.println("LG TV is OFF");
    }
}

// Concrete implementation 2
class SonyTV implements TV {

    @Override
    public void turnOn() {
        System.out.println("Sony TV is ON");
    }

    @Override
    public void turnOff() {
        System.out.println("Sony TV is OFF");
    }
}

// Abstraction
class TVRemoteControl {

    protected TV tv;

    public TVRemoteControl(TV tv) {
        this.tv = tv;
    }

    public void turnOn() {
        tv.turnOn();
    }

    public void turnOff() {
        tv.turnOff();
    }
}

// Main class
public class BridgePatternDemo {

    public static void main(String[] args) {

        // Control an LG TV
        TV lg = new LGTV();
        TVRemoteControl lgRemote = new TVRemoteControl(lg);

        lgRemote.turnOn();
        lgRemote.turnOff();

        System.out.println();

        // Control a Sony TV
        TV sony = new SonyTV();
        TVRemoteControl sonyRemote = new TVRemoteControl(sony);

        sonyRemote.turnOn();
        sonyRemote.turnOff();
    }
}
