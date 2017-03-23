package demo;


import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    private static final String template = "%s";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping(value = "/username", method = RequestMethod.GET)
    public Username username(@RequestParam(value="name", defaultValue="null") String name) {
        return new Username(counter.incrementAndGet(),
                String.format(template, name));
    }

    @RequestMapping(value = "/password", method = RequestMethod.GET)
    public Password password(@RequestParam(value = "password", defaultValue = "null") String password) {
        return new Password(counter.incrementAndGet(),
                            String.format(template, password));
    }

    @RequestMapping(value = "/role", method = RequestMethod.GET)
    public UserRole userRole(@RequestParam(value = "role", defaultValue = "null") String role){
        return new UserRole(counter.incrementAndGet(),
                            String.format(template, role));
    }
}
