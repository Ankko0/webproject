package nanaev.backend.webrest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("test")
public class MessageRest implements MessageController {

    @GetMapping("/message")
    public String getMessage(@RequestParam(value = "name", required = false,defaultValue = "World") String name) {
        return "Hello " + name;
    }
}
