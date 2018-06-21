package hello;

import hello.model.KusaRecord;
import hello.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import hello.repository.KusaRecordResository;

import javax.validation.Valid;
import java.util.Map;

@Controller
public class KusaController {
    @Autowired
    KusaRecordResository kusaResository;

    @GetMapping("/kusas/new")
    public String initCreationForm(Model model) {
        model.addAttribute("kusa", new KusaRecord());
        return "kusa";
    }

    @PostMapping("/kusas/new")
    public String greetingSubmit(@ModelAttribute KusaRecord kusaRecord) {
        this.kusaResository.save(kusaRecord);
        return "redirect:/kusas/" + kusaRecord.getId();
    }

}
