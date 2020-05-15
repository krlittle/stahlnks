package krlittle.stalnks.controllers;

import krlittle.stalnks.mapper.StalnksMapper;
import krlittle.stalnks.models.Stalnks;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class StalnksController {

    private StalnksMapper stalnksMapper;

    private StalnksController(StalnksMapper stalnksMapper) {
        this.stalnksMapper = stalnksMapper;
    }

    @GetMapping("/stalnks")
    public String stalnksForm(Model model) {
        model.addAttribute("stalnks", new Stalnks());
        return "home";
    }

    @PostMapping("/stalnks")
    public String submit(@ModelAttribute Stalnks stalnks, Model model) {

        model.addAttribute("stalnks", stalnksMapper.map(stalnks));
        return "result";
    }

}