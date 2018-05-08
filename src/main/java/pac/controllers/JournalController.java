package pac.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pac.repository.JournalRepository;

@Controller
public class JournalController {

    private final JournalRepository journalRepository;

    @Autowired
    JournalController (JournalRepository journalRepository) {
        this.journalRepository = journalRepository;
    }

    @RequestMapping(value = "/")
    public String index(Model model) {
        model.addAttribute("journal", journalRepository.findAll());
        return "index";
    }
}
