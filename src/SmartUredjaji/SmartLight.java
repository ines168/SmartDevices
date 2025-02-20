package SmartUredjaji;

public class SmartLight extends SmartDevice implements RemoteControllable{

    public SmartLight(String version) {
        super(version, "SmartLight");
    }

    @Override
    public void remoteControl(String command) {

    }

    @Override
    public String performAction() {
        return "";
    }

    @Override
    public String displayStatus() {
        return "";
    }
}
