package lldPractice.bookMyShow;

import java.util.*;

public class CinemasScreen {
    private String id;
    private Cinemas cinemas;
    private String showName;
    private long showTiming;
    private long seatsCount;
    private Map<Long, User> bookedSeats;

    @Override
    public String toString() {
        return "CinemasScreen{" +
                "id='" + id + '\'' +
                ", cinemas=" + cinemas +
                ", showName='" + showName + '\'' +
                ", showTiming=" + showTiming +
                ", seatsCount=" + seatsCount +
                ", bookedSeats=" + bookedSeats +
                '}';
    }

    public CinemasScreen(Cinemas cinemas, String showName, long showTiming, long seatsCount) {
        this.id = UUID.randomUUID().toString();
        this.cinemas = cinemas;
        this.showName = showName;
        this.showTiming = showTiming;
        this.seatsCount = seatsCount;
        this.bookedSeats = new HashMap<>();
    }

    public synchronized String bookSeat(CinemasScreen cinemasScreen, User user, List<Long> seats) {
        for (Long seatsNumber : seats) {
            if (seatsNumber > this.seatsCount) {
                return "Invalid Seat Number";
            }
            if (bookedSeats.containsKey(seatsNumber)) {
                return "Seat No: " + seatsNumber + " is already booked please try another seats";
            }
        }
        for (Long seat : seats) {
            this.bookedSeats.put(seat, user);
//            user.addTicketToUserAccount(cinemasScreen, seat);
        }
        return "Booked Successfully";
    }

    public String getShowName() {
        return this.showName;
    }
}
