





import org.apache.spark.broadcast.Broadcast;



import java.util.Iterator;



public class SparkFlightApp {








        data = data.filter(x -> !x.equals(dataHeader));






        return flights.mapToPair(



                    float delay = data[Constants.ARR_DELAY].length() > 0 ? Float.parseFloat(data[Constants.ARR_DELAY]) : Constants.ZERO;
                    boolean cancelled = Float.parseFloat(data[Constants.IS_CANCELED]) == 1;

                    return new Tuple2<>(new Tuple2<>(originAirport, destinationAirport),
                            new FlightSerializable(originAirport, destinationAirport, delay, cancelled));











        );









//        flightRDD.groupByKey().mapValues(


//                    float delayedCounter = Constants.ZERO;
//                    float max = Float.MIN_VALUE;







//                            max = Float.max(max, delay);


//                        counter++;




                (statContainer, y) -> StatContainer.addValue(statContainer,











}
