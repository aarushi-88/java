class TicketBooking {
    int seats = 2;

    synchronized void bookSeat(int n) {
        if (n <= seats) {
            seats -= n;
            System.out.println(Thread.currentThread().getName() + " booked successfully");
        } else {
            System.out.println(Thread.currentThread().getName() + " booking failed");
        }
    }
}