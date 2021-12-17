



public class StatContainer implements Serializable {




    private static final String PATTERN = "MaxDelay: %f, CancelledPercent: %f, DelayedPercent: %f";






    public int getCancelled() {





    }







        this.cancelled = cancelled;






                a.getDelayed() + (delayed > 0 ? 1 : 0),


    public static StatContainer add(StatContainer a, StatContainer b) {

                a.getCancelled() + b.getCancelled(),





    }
}
