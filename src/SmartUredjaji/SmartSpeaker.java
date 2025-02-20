package SmartUredjaji;

public class SmartSpeaker extends SmartDevice implements RemoteControllable{
    public SmartSpeaker(String version) {
        super(version, "SmartSpeaker");
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
