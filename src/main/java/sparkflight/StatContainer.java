

import java.io.Serializable;

public class StatContainer implements Serializable {




    private static final String PATTERN = "MaxDelay: %f, CancelledPercent: %f, DelayedPercent: %f";


    public float getMax() {



    public int getCancelled() {
        return cancelled;




    }


        return counter;




        this.cancelled = cancelled;



    public static StatContainer addValue(StatContainer a, float max, boolean cancelled, float delayed) {


                a.getDelayed() + (delayed > 0 ? 1 : 0),


    public static StatContainer add(StatContainer a, StatContainer b) {

                a.getCancelled() + b.getCancelled(),


    }
    public String compareStat() {

    }
}
