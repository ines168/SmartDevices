package SmartUredjaji;

public class SmartThermostat extends SmartDevice implements RemoteControllable {
    public SmartThermostat(String version) {
        super(version, "SmartThermostat");
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
