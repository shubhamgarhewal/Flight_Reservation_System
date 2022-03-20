package FRS;

public class Passenger {

    private static Address address;
    private static Contact contact;

    public Passenger(String state, String city,
                     String street, String name, String phone,
                     String email) {
        this.address = new Address(street, city, state);
        this.contact = new Contact(name, phone, email);
    }

    public String getAddress() {
        return "Passenger address: " + address.street + " " + address.city + " " + address.state;
    }

    public String getContact() {
        return "Passenger name: " + contact.name + " Phone Number is: " + contact.phone + " EmailId: " +  contact.email;
    }

    private static class Address {
        String street, city, state;

        public Address(String street, String city, String state) {
            this.street = street;
            this.city = city;
            this.state = state;
        }
    }

        private static class Contact {
            String name, phone, email;

            public Contact(String name, String phone, String email) {
                this.name = name;
                this.phone = phone;
                this.email = email;
            }

        }

    }


