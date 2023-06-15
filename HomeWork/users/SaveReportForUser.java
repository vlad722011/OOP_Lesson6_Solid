package users;

import java.util.ArrayList;
import java.util.List;

public interface SaveReportForUser {
    User user = null;
    List<UsersSkills> userSkills = new ArrayList<>();
    void save(User user, List<UsersSkills> userSkills);
}
