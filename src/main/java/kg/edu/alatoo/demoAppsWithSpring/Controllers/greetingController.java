package kg.edu.alatoo.demoAppsWithSpring.Controllers;

import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Collections;

@Controller
public class greetingController {
    @GetMapping("greeting")
    public String greeting(@RequestParam(name = "name", required = false,
            defaultValue = "Noname") String name, @NotNull Model model) {
        model.addAttribute("name", name);
        return "greeting";
    }
}
