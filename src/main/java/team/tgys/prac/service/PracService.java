package team.tgys.prac.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import team.tgys.prac.domain.Prac;
import team.tgys.prac.repository.PracRepositoty;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PracService {

    private final PracRepositoty pracRepositoty;

    public List<Prac> findAll(){
        return pracRepositoty.findAll();
    }

}
