





import org.apache.spark.broadcast.Broadcast;







public class SparkFlightApp {















        return flights.mapToPair(



                    float delay = data[Constants.ARR_DELAY].length() > 0 ? Float.parseFloat(data[Constants.ARR_DELAY]) : Constants.ZERO;















        );









//        flightRDD.groupByKey().mapValues(


//                    float delayedCounter = Constants.ZERO;











//                        counter++;




                (statContainer, y) -> StatContainer.addValue(statContainer,











}
