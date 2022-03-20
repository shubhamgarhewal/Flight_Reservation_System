package FRS;

public class Tickets {

    private Passenger passenger;
    private Flight flight;
    private String pnr;
    private String seatNo;
    private String departure;
    private String arrival;
    private String departureDateAndTime;
    private String arrivalDateAndTime;
    private boolean status;
    private float cost;

        public Tickets(Passenger passenger, Flight flight, String pnr,  String seatNo, String departure, String arrival,  String departureDateAndTime,
                       String arrivalDateAndTime, float cost, boolean status) {
            this.pnr = pnr;
            this.departure = departure;
            this.arrival = departure;
            this.flight = flight;
            this.departureDateAndTime = departureDateAndTime;
            this.arrivalDateAndTime = arrivalDateAndTime;
            this.passenger = passenger;
            this.seatNo = seatNo;
            this.cost = cost;
            this.status = status;
        }

        public String getPnr() {
            return pnr;
        }

//        public void setPnr(String pnr) {
//            this.pnr = pnr;
//        }
//
//        public String getDeparture() {
//            return departure;
//        }
//
//        public String getArrival() {
//            return arrival;
//        }
//
//        public String getDepartureDateTime() {
//            return departureDateAndTime;
//        }
//
//        public String getArrivalDateTime() {
//            return arrivalDateAndTime;
//        }
//
//        public String getSeatNo() {
//            return seatNo;
//        }

        public String checkStatus() {
            if (status) {
                return "Status : Cancelled";
            }
            {
                return "Status : Confirmed";
            }
        }
}

