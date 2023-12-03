package dto;

import io.javalin.validation.ValidationError;
import java.util.List;
import java.util.Map;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class UserEditPageWithErrors extends BasePage {

    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String token;
    private Map<String, List<ValidationError<Object>>> errors;

    public UserEditPageWithErrors(Long id, String firstName, String lastName, String email, String password, String token) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.token = token;
    }
}
