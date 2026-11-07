

abstract class HotelBooking{
    void display() {
        System.out.println("Welcome to Hotel Waikiki");
    }
     abstract void confirmBooking();
}
class SuiteBooking extends HotelBooking{
    @Override
    void confirmBooking(){
        System.out.println(" Suite Booking Confirmed");
    }


    @Override
    void display(){
        super.display();
        System.out.println("Welcome to Suite room");
        System.out.println("-------------------------------");
    }


    }
    class DeluxeBooking extends HotelBooking{

        @Override
        void confirmBooking(){
            System.out.println(" Deluxe Booking Confirmed");
        }
        @Override
        void display(){
            super.display();
            System.out.println("Welcome to Deluxe room");
            System.out.println("-------------------------------");
        }

    }


void main() {

    SuiteBooking s = new SuiteBooking();
DeluxeBooking d = new DeluxeBooking();
s.display();
s.confirmBooking();
d.display();
d.confirmBooking();

}
