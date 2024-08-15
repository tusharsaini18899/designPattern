package lldPractice.bookMyShow;

import java.util.ArrayList;
import java.util.List;

public class Gateway {
    private final List<Cinemas> cinemasList;
    private final List<CinemasScreen> screenList;

    public Gateway() {
        this.cinemasList = new ArrayList<>();
        this.screenList = new ArrayList<>();
    }

    public User addNewUser(String email, String userName) {
        return new User(email, userName);
    }

    public Cinemas addNewCinema(String name, String city) {
        Cinemas cinema = new Cinemas(name, city);
        this.cinemasList.add(cinema);
        return cinema;
    }

    public CinemasScreen addNewScreen(Cinemas cinemas, String showName, long showTiming, long seatsCount) {
        CinemasScreen screen = new CinemasScreen(cinemas, showName, showTiming, seatsCount);
        screenList.add(screen);
        cinemas.addScreenToCinema(screen);
        return screen;
    }

    public synchronized String bookSeat(CinemasScreen cinemasScreen, User user, List<Long> seats) {
        return cinemasScreen.bookSeat(cinemasScreen, user, seats);
    }

    public List<Cinemas> getAllCinemaByCityAndShowName(String city, String showName) {
        List<Cinemas> cinemas = new ArrayList<>();
        for (Cinemas cinemas1 : this.cinemasList) {
            if (cinemas1.getCity().equals(city)) {
                List<CinemasScreen> filter = new ArrayList<>();
                for (CinemasScreen cinemasScreen : cinemas1.getScreens()) {
                    if (cinemasScreen.getShowName().equals(showName)) {
                        filter.add(cinemasScreen);
                    }
                }
                if (!filter.isEmpty())
                    cinemas.add(cinemas1.mapScreenToCinema(cinemas1, filter));
            }
        }
        return cinemas;
    }
}
