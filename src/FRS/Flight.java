package FRS;

    public class Flight {
        private String airline;
        private String flightNumber;

        public Flight(String airline, String flightNumber) {
            this.airline = airline;
            this.flightNumber = flightNumber;
        }

        public String getAirline() {
            return airline;
        }

        public void setAirline(String airline) {
            this.airline = airline;
        }

        public String getFlightNumber() {
            return flightNumber;
        }

        public void setFlightNumber(String flightNumber) {
            this.flightNumber = flightNumber;
        }

}

