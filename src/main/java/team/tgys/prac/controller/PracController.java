package team.tgys.prac.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import team.tgys.prac.domain.Prac;
import team.tgys.prac.service.PracService;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@RestController
public class PracController {

    private final PracService pracService;

    @PostMapping("/test")
    public List<Prac> pracList(){

        return  pracService.findAll();
    }

    @GetMapping("/test")
    public List<Prac> findPrac(){

        return  pracService.findAll();
    }
}
