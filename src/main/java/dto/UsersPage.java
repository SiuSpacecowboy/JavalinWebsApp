package dto;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class UsersPage extends BasePage {

    private List<User> users;
    private Long page;
    private Long finalPage;
    private boolean haveUsers;

    public UsersPage(List<User> users) {
        this.users = users;
    }
}
