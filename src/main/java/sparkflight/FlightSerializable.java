


import scala.Serializable;

public class FlightSerializable implements Serializable {

    private Integer destinationAirportId;


        this.originAirportId = originAirportId;
        this.destinationAirportId = destinationAirportId;
        this.delay = delay;
        this.cancelled = cancelled;
    }

    private float delay = 0;
    private boolean cancelled = false;

    public Integer getDestinationAirportId() {
        return destinationAirportId;


    public Integer getOriginAirportId() {
        return originAirportId;
    }

    public float getDelay() {
        return delay;
    }

    public boolean isCancelled() {
        return cancelled;
    }

}
