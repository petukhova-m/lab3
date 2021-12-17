


import scala.Serializable;

public class FlightSerializable implements Serializable {



    public FlightSerializable(Integer originAirportId, Integer destinationAirportId, float delay, boolean cancelled) {

        this.destinationAirportId = destinationAirportId;
        this.delay = delay;
        this.cancelled = cancelled;
    }


    private boolean cancelled = false;

    public Integer getDestinationAirportId() {
        return destinationAirportId;


    public Integer getOriginAirportId() {
        return originAirportId;


    public float getDelay() {

    }



    }

}
