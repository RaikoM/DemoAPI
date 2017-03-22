package demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by raiko_000 on 22.03.2017.
 */
@RestController
public class Controller {

    private static final String template = "N/A";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping(value = "/username", method = RequestMethod.GET)
    public Username username(@RequestParam(value="username", defaultValue = "N/A")String username){
        return new Username(counter.incrementAndGet(),
                            String.format(template, username));
    }
    @RequestMapping(value = "/password", method = RequestMethod.GET)
    public Password password(@RequestParam(value="password", defaultValue = "N/A")String password){
        return new Password(counter.incrementAndGet(),
                            String.format(template, password));
    }
}
