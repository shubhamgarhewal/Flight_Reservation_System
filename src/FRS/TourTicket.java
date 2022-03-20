package FRS;

public class TourTicket extends Tickets{

        public TourTicket(String pnr, String departure, String arrival, Flight flight, String departureDateAndTime,
                             String arrivalDateAndTime, Passenger passenger, String seatNo, float cost, boolean status) {
            super(passenger, flight, pnr, departure, arrival, departureDateAndTime, arrivalDateAndTime, seatNo, cost, status);
        }
}


