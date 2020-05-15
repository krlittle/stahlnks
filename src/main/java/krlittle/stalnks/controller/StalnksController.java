package krlittle.stalnks.controller;

import krlittle.stalnks.models.Stalnks;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StalnksController {

    @GetMapping("/stalnks")
    public String stalnksForm(Model model) {
        model.addAttribute("stalnks", new Stalnks());
        return "stalnks";
    }

    @PostMapping("/stalnks")
    public String submit(@ModelAttribute Stalnks stalnks) {
        return "result";
    }
}