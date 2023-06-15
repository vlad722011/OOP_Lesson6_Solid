package users;

public abstract class UsersSkills {
    private User user;

    public UsersSkills(User user) {
        this.user = user;
    }
    abstract void add();
}
