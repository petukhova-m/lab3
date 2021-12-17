

import java.io.Serializable;

public class StatContainer implements Serializable {

    private int cancelled;


    private static final String PATTERN = "MaxDelay: %f, CancelledPercent: %f, DelayedPercent: %f";


    public float getMax() {

    }

    public int getCancelled() {
        return cancelled;


    public int getDelayed() {

    }


        return counter;


    public StatContainer(float max, int cancelled, int delayed, int counter) {

        this.cancelled = cancelled;
        this.delayed = delayed;

    }
    public static StatContainer addValue(StatContainer a, float max, boolean cancelled, float delayed) {

                a.getCancelled() +  (cancelled ? 1 : 0),
                a.getDelayed() + (delayed > 0 ? 1 : 0),


    public static StatContainer add(StatContainer a, StatContainer b) {

                a.getCancelled() + b.getCancelled(),
                a.getDelayed() + b.getDelayed(),

    }
    public String compareStat() {

    }
}
