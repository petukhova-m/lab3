













public class SparkFlightApp {



















                    float delay = data[Constants.ARR_DELAY].length() > 0 ? Float.parseFloat(data[Constants.ARR_DELAY]) : Constants.ZERO;

























//        flightRDD.groupByKey().mapValues(


//                    float delayedCounter = Constants.ZERO;
















                (statContainer, y) -> StatContainer.addValue(statContainer,











}
