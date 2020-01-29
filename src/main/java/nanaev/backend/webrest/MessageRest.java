package nanaev.backend.webrest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;


@RestController
@RequestMapping("test")
public class MessageRest implements MessageController {

    private  WorkerService workerService;

    @RequestMapping("/show")
    public Optional<Worker> getProduct (@RequestParam(value = "id", required = true ) Long id, Model model)
    {
        //model.addAttribute("Worker", workerService.getById(id));
        return workerService.getById(1L);
    }

   /* @RequestMapping(value = "Worker", method = RequestMethod.GET)
    public String listBooks(Model model){
        model.addAttribute("Worker", new Worker());
        model.addAttribute("listParts", this.partService.listParts());

        return "show";
    }*/

    @GetMapping("/message")
    public String getMessage(@RequestParam(value = "name", required = false,defaultValue = "World") String name) {
        return "Hello " + name;
    }
}
