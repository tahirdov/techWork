package repos;

import apis.AuthController;
import org.springframework.stereotype.Repository;

@Repository
public class AuthRepo {
    private final AuthController auth;

    public AuthRepo(AuthController auth) {
        this.auth = auth;
    }

    private void doThing (String username) {
        auth.farewell(username);
    }

}
