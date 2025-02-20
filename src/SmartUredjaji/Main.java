package SmartUredjaji;

public class Main {
    public static void main(String[] args) {
        SmartLight light = new SmartLight("1");
        SmartThermostat thermo = new SmartThermostat("1");
        SmartSpeaker speaker = new SmartSpeaker("1");

        //LIGHT AKCIJE
        System.out.println("Light: ");

        //THERMOSTAT AKCIJE
        System.out.println("Thermo: ");

        //SPEAKER AKCIJE
        System.out.println("Speaker: ");

        //UPDATE VERZIJE
        System.out.println("Update uređaja:");
        light.updateFirmware("2");
        thermo.updateFirmware("2");
        speaker.updateFirmware("2");

    }
}
