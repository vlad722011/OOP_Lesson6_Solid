package users;

import java.util.ArrayList;
import java.util.List;

public class Loafer extends UsersSkills {
    private User user;
    List<UsersSkills> userSkills = new ArrayList<>();

    public Loafer(User user) {
        super(user);
    }

    @Override
    void add() {
        UsersSkills skills = new Loafer(user);
        userSkills.add(skills);
    }
    @Override
    public String toString() {
        return String.format("раздолбай");
    }
}
