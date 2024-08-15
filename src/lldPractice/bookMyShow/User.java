package lldPractice.bookMyShow;

import java.util.*;

public class User {
    private String id;
    private String userName;
    private String email;

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
//    private Map<CinemasScreen, List<Long>> cinemasScreens;

    public User(String email, String userName) {
        this.id = UUID.randomUUID().toString();
        this.email = email;
        this.userName = userName;
//        this.cinemasScreens = new HashMap<>();
    }

//    public void addTicketToUserAccount(CinemasScreen cinemasScreen,Long seatNo){
//        List<Long> temp = Collections.singletonList(seatNo);
//        if (this.cinemasScreens.containsKey(cinemasScreen)) {
//            temp = this.cinemasScreens.get(cinemasScreen);
//            temp.add(seatNo);
//        }
//        this.cinemasScreens.put(cinemasScreen, temp);
//    }
}
