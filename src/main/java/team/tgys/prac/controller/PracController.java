package team.tgys.prac.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import team.tgys.prac.domain.Prac;
import team.tgys.prac.service.PracService;

import java.util.ArrayList;
import java.util.List;

@RestController
public class PracController {

    private final PracService pracService;

    public PracController(PracService pracService) {
        this.pracService = pracService;
    }

    @PostMapping("/test")
    public List<Prac> pracList(){

        return  pracService.findAll();

    }
}
