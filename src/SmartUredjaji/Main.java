package SmartUredjaji;

public class Main {
    public static void main(String[] args) {
        SmartLight light = new SmartLight();
        SmartThermostat thermo = new SmartThermostat();
        SmartSpeaker speaker = new SmartSpeaker();

        //LIGHT AKCIJE
        System.out.println("\nLight: ");
        System.out.println(light.displayStatus());
        System.out.println(light.performAction());
        light.remoteControl("pojačaj");
        light.remoteControl("pojačaj");

        //THERMOSTAT AKCIJE
        System.out.println("\nThermo: ");
        System.out.println(thermo.displayStatus());
        System.out.println(thermo.performAction());
        thermo.remoteControl("smanji");
        thermo.remoteControl("smanji");

        //SPEAKER AKCIJE
        System.out.println("\nSpeaker: ");
        System.out.println(speaker.displayStatus());
        System.out.println(speaker.performAction());
        speaker.remoteControl("pojačaj");

        //UPDATE VERZIJE
        System.out.println("\nUpdate uređaja:");
        light.updateFirmware("2.0");
        thermo.updateFirmware("2.0");
        speaker.updateFirmware("2.0");

        //STATUSI NAKON SVIH PROMJENA
        System.out.println("\nStatusi nakon svih promjena:");
        System.out.println(light.displayStatus());
        System.out.println(thermo.displayStatus());
        System.out.println(speaker.displayStatus());

    }
}
