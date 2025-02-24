package SmartUredjaji;

import java.util.Scanner;

public class SmartLight extends SmartDevice implements RemoteControllable{
    private boolean jeUkljuceno;
    private int svjetlina;

    public SmartLight() {
        this("1.0", false, 50);
    }

    public SmartLight(String version, boolean jeUkljuceno, int svjetlina) {
        super(version, "SmartLight");
        this.jeUkljuceno = jeUkljuceno;
        if (svjetlina > 100 || svjetlina < 0 ) {
            this.svjetlina = 50;
        } else {
            this.svjetlina = svjetlina;
        }
    }

    @Override
    public void remoteControl(String command) {
        switch (command) {
            case "upali" -> this.jeUkljuceno = true;
            case "ugasi" -> this.jeUkljuceno = false;
            case "pojačaj" -> this.svjetlina += 10;
            case "smanji" -> this.svjetlina -= 10;
            default -> System.out.println("Nisam razumio. SmartLight ostaje isti.");
        }
    }

    @Override
    public String performAction() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Želiš li: 1.Upaliti/Ugasiti SmartLight ili 2.pojačati/smanjiti svjetlinu? Unesi broj opcije:");
        try {
            int izbor = sc.nextInt();
            if(izbor == 1) {
                jeUkljuceno = !jeUkljuceno;
            } else if (izbor == 2) {
                System.out.println("Unesi svjetlinu (0-100 %): ");
                int svjetlina = sc.nextInt();
                if (svjetlina >0 && svjetlina<=100) {
                    jeUkljuceno = true;
                    this.svjetlina = svjetlina;
                } else {
                    System.out.println("Nevažeći unos. Svjetlina ostaje ista.");
                }
            }
        } catch (Exception e) {
            System.out.println("Nevažeći unos. Svjetlina ostaje ista.");
            sc.nextLine();
        }
        return displayStatus();
    }

    @Override
    public String displayStatus() {
        return naziv + " - " + (jeUkljuceno ? "ON Svjetlina: " + svjetlina + "%" : "OFF");
    }
}
