package HarrysSalon;

import java.time.*;

public class Reservation {
    private String name;
    private LocalDateTime time;
    private String vare;
    private String betaling;
    private String pris;
    public String toString() {
        return name + ";" + time+ ";" + vare + ";" + betaling + ";" + pris + " kr.";
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    //det nye jeg har added
    public void setVare(String vare) {
        this.vare = vare;
    }

    public String getVare() {
        return vare;
    }

    public void setBetaling(String betaling) {
        this.betaling = betaling;
    }

    public String getBetaling() {
        return betaling;
    }

    public void setPris(String pris) {
        this.pris = pris;
    }

    public String getPris() {
        return pris;
    }
}