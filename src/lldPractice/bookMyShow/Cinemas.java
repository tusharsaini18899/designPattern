package lldPractice.bookMyShow;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Cinemas {
    private String id;
    private String name;
    private String city;
    private List<CinemasScreen> screens;

    @Override
    public String toString() {
        return "Cinemas{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                '}';
    }

    public Cinemas(String name, String city) {
        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.city = city;
        this.screens = new ArrayList<>();
    }

    public void addScreenToCinema(CinemasScreen cinemasScreen) {
        this.screens.add(cinemasScreen);
    }

    public void addScreensToCinema(List<CinemasScreen> cinemasScreen) {
        this.screens.addAll(cinemasScreen);
    }

    public Cinemas mapScreenToCinema(Cinemas cinemas, List<CinemasScreen> cinemasScreens) {
        cinemas.screens = new ArrayList<>();
        cinemas.screens.addAll(cinemasScreens);
        return cinemas;
    }

    public List<CinemasScreen> getScreens() {
        return this.screens;
    }

    public String getCity() {
        return this.city;
    }
}
