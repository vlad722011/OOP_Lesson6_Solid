package users;

import java.util.ArrayList;
import java.util.List;

public class Hardworking extends UsersSkills {
    private User user;
    List<UsersSkills> userSkills = new ArrayList<>();

    public Hardworking(User user) {
        super(user);
    }

    @Override
    void add() {
        Hardworking skills = new Hardworking(user);
        userSkills.add(skills);
    }

    @Override
    public String toString() {
        return String.format("трудолюбивый");
    }
}
