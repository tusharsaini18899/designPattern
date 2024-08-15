package lldPractice.bookMyShow;

import java.util.Arrays;
import java.util.List;

public class BookMyShowMain {

    public static void main(String[] args) {
        Gateway gateway = new Gateway();

        // add new user
        User user1 = gateway.addNewUser("user1@gmail.com", "User1");
        User user2 = gateway.addNewUser("user12@gmail.com", "User2");

        // adding new cinema
        Cinemas cinemas1 = gateway.addNewCinema("PVR", "Gurgaon");
        // add movie to screen
        CinemasScreen screen11 = gateway.addNewScreen(cinemas1, "Deadpool", System.currentTimeMillis() + 1000, 20);
        CinemasScreen screen12 = gateway.addNewScreen(cinemas1, "Extraction", System.currentTimeMillis() + 10000, 30);
        // book seats
        gateway.bookSeat(screen12, user1, List.of(8L));

        // adding new cinema
        Cinemas cinemas2 = gateway.addNewCinema("INOX", "Gurgaon");
        // add movie to screen
        CinemasScreen screen21 = gateway.addNewScreen(cinemas2, "Standup Comedy", System.currentTimeMillis() + 1000, 10);
        CinemasScreen screen22 = gateway.addNewScreen(cinemas2, "Deadpool", System.currentTimeMillis() + 10000, 40);
        // book seats
        gateway.bookSeat(screen22, user2, Arrays.asList(11L, 12L));

        List<Cinemas> search = gateway.getAllCinemaByCityAndShowName("Gurgaon", "Extraction");
        System.out.println(search);

    }
}
