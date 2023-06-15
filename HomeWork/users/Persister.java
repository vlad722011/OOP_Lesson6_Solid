package users;

import java.util.ArrayList;
import java.util.List;

public class Persister extends UsersSkills{
    private User user;
    List<UsersSkills> userSkills = new ArrayList<>();

    public Persister(User user) {
        super(user);
    }

    @Override
    void add() {
        UsersSkills skills = new Persister(user);
        userSkills.add(skills);
    }

    @Override
    public String toString() {
        return String.format("упорный");
    }
}