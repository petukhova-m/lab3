package sparkflight;


import org.apache.spark.api.java.JavaPairRDD;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;
import org.apache.spark.broadcast.Broadcast;

import java.util.Map;

import java.util.Iterator;



public class SparkFlightApp {




    private static final String QUOTE = "\"";



        data = data.filter(x -> !x.equals(dataHeader));
        return data;


        return data.replaceAll(symbol, "");
    }

        return flights.mapToPair(

                    String[] data = line.split(FLIGHT_DELIMITER);

                    float delay = data[Constants.ARR_DELAY].length() > 0 ? Float.parseFloat(data[Constants.ARR_DELAY]) : Constants.ZERO;
                    boolean cancelled = Float.parseFloat(data[Constants.IS_CANCELED]) == 1;
                    int originAirport = Integer.parseInt(deleteSymbol(data[Constants.ORIGIN_AIRPORT_ID], QUOTE));
                    return new Tuple2<>(new Tuple2<>(originAirport, destinationAirport),
                            new FlightSerializable(originAirport, destinationAirport, delay, cancelled));

        );
    }

        return airport.mapToPair(


                    int code = Integer.parseInt(deleteSymbol(data[Constants.CODE], QUOTE));
                    String description = deleteSymbol(data[Constants.DESCRIPTION], QUOTE);
                    return new Tuple2<>(code, description);

        );

    public static void main(String[] args) {

        JavaSparkContext sc = new JavaSparkContext(conf);


        JavaPairRDD<Tuple2<Integer, Integer>, FlightSerializable> flightRDD = flightToPair(flights);
        JavaPairRDD<Integer, String> airportRDD = airportToPair(airports);

//        flightRDD.groupByKey().mapValues(


//                    float delayedCounter = Constants.ZERO;
//                    float max = Float.MIN_VALUE;
//                    int counter = Constants.ZERO;
//                    float delay;
//                    for (FlightSerializable flight : flightsArray) {
//                        cancelledCounter += (flight.isCancelled()) ? 1 : Constants.ZERO;

//

//                            max = Float.max(max, delay);
//                            delayedCounter++;

//                        counter++;
//                    }

//                })
        flightRDD.combineByKey(x -> new StatContainer(x.getDelay(), x.isCancelled() ? 1 : 0, (int) x.getDelay(), 1),
                (statContainer, y) -> StatContainer.addValue(statContainer,
                                                            y.getDelay(),
                                                            y.isCancelled(),



                    Tuple2<Integer, Integer> flightKey = flight._1;
                    Map<Integer, String> value = airportBroadcasted.value();
                    return String.format(RESULTPATTERN, value.get(flightKey._1), value.get(flightKey._2), flight._2.compareStat());
                }).saveAsTextFile(args[0]);


}
