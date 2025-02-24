package SmartUredjaji;

import java.util.Scanner;

public class SmartSpeaker extends SmartDevice implements RemoteControllable{
    private boolean jeUkljuceno;
    private int glasnoca;

    public SmartSpeaker() {
        this("1.0", false, 50);
    }

    public SmartSpeaker(String version, boolean jeUkljuceno, int glasnoca) {
        super(version, "SmartSpeaker");
        this.jeUkljuceno = jeUkljuceno;
        if(glasnoca > 100 || glasnoca < 0 ) {
            this.glasnoca = 50;
        } else {
            this.glasnoca = glasnoca;
        }

    }

    @Override
    public void remoteControl(String command) {
        switch (command) {
            case "upali" -> this.jeUkljuceno = true;
            case "ugasi" -> this.jeUkljuceno = false;
            case "pojačaj" -> this.glasnoca += 10;
            case "smanji" -> this.glasnoca -= 10;
            default -> System.out.println("Nisam razumio. SmartSpeaker ostaje isti.");
        }
    }

    @Override
    public String performAction() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Želiš li: 1.Upaliti/Ugasiti SmartSpeaker ili 2.Pojačati/Smanjiti glasnoću? Unesi broj opcije:");
        try {
            int izbor = sc.nextInt();
            if(izbor == 1) {
                jeUkljuceno = !jeUkljuceno;
            } else if (izbor == 2) {
                System.out.println("Unesi volumen (0 - 100%): ");
                int glasnoca = sc.nextInt();
                if (glasnoca >0 && glasnoca <=100 ) {
                    jeUkljuceno = true;
                    this.glasnoca = glasnoca;
                } else {
                    System.out.println("Nevažeći unos. Glasnoća ostaje ista.");
                }
            }
        } catch (Exception e) {
            System.out.println("Nevažeći unos. Glasnoća ostaje ista.");
            sc.nextLine();
        }
        return displayStatus();
    }

    @Override
    public String displayStatus() {
        return naziv + " - " + (jeUkljuceno ? "ON Glasnoća: " + glasnoca + "%" : "OFF");
    }
}
