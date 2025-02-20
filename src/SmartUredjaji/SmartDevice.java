package SmartUredjaji;

public abstract class SmartDevice {
    String version;
    String naziv;

    public SmartDevice(String version, String naziv) {
        this.version = version;
        this.naziv = naziv;
    }

    public abstract String performAction();
    public abstract String displayStatus();

    public void updateFirmware(String version) {
        System.out.println( naziv + " UPDATE \tStara verzija: " + this.version + " \tNova verzija:" + version);
        this.version = version;
    }
}