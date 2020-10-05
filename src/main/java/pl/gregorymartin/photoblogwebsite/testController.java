package pl.gregorymartin.photoblogwebsite;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
class testController {

    public testController() {
    }

    @GetMapping
    String siema(){
        return "elo";
    }
}

