package FRS;

public class Main {

        public static void main(String[] args) {
            Passenger passenger = new Passenger("Madhya Pradesh", "Jabalpur,",
                    "Shiv nagar,", "Shubham Garhewal",
                    "+918866443377", "shubh.gar@gmail.com");


            Flight flight = new Flight("Airline : IndiGo" , "Flight no : 6E77114");


            RegTicket regularTicket = new RegTicket("PNR of Regular ticket : PNR123456", "Departure city : Hyderabad",
                    "Arrival city : Bangalore", flight,
                    "Departure Date : 15th March 2022, Departure Time : 13:20",
                    "Arrival Date : 26 March 2022, Arrival Time : 15:50", passenger, "Seat no: 48 A", 5240, false);


            TourTicket touristTicket = new TourTicket("PNR of Tourist ticket : PNR789465", "Departure city : Pune",
                    "Arrival city : Jabalpur", flight, "Arrival Date : 26 March 2022, Arrival Time : 7:25",
                    "Departure Date : 26 March 2022, Departure Time : 5:15", passenger, "Seat no: 25 B", 2504, false);


            flight(flight);
            pnr(regularTicket);
            passenger(passenger);
            flight(flight);
            pnr(touristTicket);
            passenger(passenger);
        }


    private static void flight(Flight flight) {
        System.out.println(flight.getAirline());
        System.out.println(flight.getFlightNumber());
    }

    public static void pnr(Tickets ticket) {
            System.out.println(ticket.getPnr());
            System.out.println(ticket.checkStatus());
        }
    public static void passenger(Passenger passenger) {
        System.out.println(passenger.getContact());
        System.out.println(passenger.getAddress());
        System.out.println();
        System.out.println();
        }

}
