package SmartUredjaji;

import java.util.Scanner;

public class SmartThermostat extends SmartDevice implements RemoteControllable {
    private double temp;

    public SmartThermostat(){
        this("1.0", 30.0);
    }

    public SmartThermostat(String version){
        this(version, 0.0);
    }

    public SmartThermostat(String version, double temp) {
        super(version, "SmartThermostat");
        this.temp = temp;
    }

    @Override
    public void remoteControl(String command) {
        switch (command) {
            case "pojačaj" -> this.temp += 1.0;
            case "smanji" -> this.temp -= 1.0;
            default -> System.out.println("Nisam razumio. SmartThermostat ostaje isti.");
        }
    }

    @Override
    public String performAction() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesi novu temperaturu:");
        try {
            double temp = sc.nextDouble();
            if (temp>=10 && temp<40) {
                this.temp = temp;
            } else {
                System.out.println("Nevažeći unos. Temperatura ostaje ista.");
            }
        } catch (Exception e) {
            System.out.println("Nevažeći unos. Temperatura ostaje ista.");
            sc.nextLine();
        }
        return displayStatus();
    }

    @Override
    public String displayStatus() {
        return naziv + " - " + "Temperatura: " + temp + "°C";
    }
}
