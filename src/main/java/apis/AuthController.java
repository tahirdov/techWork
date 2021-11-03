package apis;

import org.springframework.stereotype.Controller;

@Controller
public class AuthController {

    public String hail (String username) {
        return String.format("Hello, /s", username);
    }

    public String farewell (String username) {
        return String.format("See you later, /s", username);
    }
}
