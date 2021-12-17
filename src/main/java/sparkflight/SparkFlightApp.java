package sparkflight;





import org.apache.spark.broadcast.Broadcast;

import java.util.Map;

import java.util.Iterator;



public class SparkFlightApp {




    private static final String QUOTE = "\"";



        data = data.filter(x -> !x.equals(dataHeader));
        return data;





        return flights.mapToPair(

                    String[] data = line.split(FLIGHT_DELIMITER);

                    float delay = data[Constants.ARR_DELAY].length() > 0 ? Float.parseFloat(data[Constants.ARR_DELAY]) : Constants.ZERO;
                    boolean cancelled = Float.parseFloat(data[Constants.IS_CANCELED]) == 1;

                    return new Tuple2<>(new Tuple2<>(originAirport, destinationAirport),
                            new FlightSerializable(originAirport, destinationAirport, delay, cancelled));







                    int code = Integer.parseInt(deleteSymbol(data[Constants.CODE], QUOTE));

                    return new Tuple2<>(code, description);

        );







        JavaPairRDD<Integer, String> airportRDD = airportToPair(airports);

//        flightRDD.groupByKey().mapValues(


//                    float delayedCounter = Constants.ZERO;
//                    float max = Float.MIN_VALUE;


//                    for (FlightSerializable flight : flightsArray) {
//                        cancelledCounter += (flight.isCancelled()) ? 1 : Constants.ZERO;

//

//                            max = Float.max(max, delay);


//                        counter++;


//                })

                (statContainer, y) -> StatContainer.addValue(statContainer,





                    Tuple2<Integer, Integer> flightKey = flight._1;
                    Map<Integer, String> value = airportBroadcasted.value();

                }).saveAsTextFile(args[0]);


}
