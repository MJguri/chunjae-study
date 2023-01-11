package team.tgys.prac.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Prac {

    @GeneratedValue
    @Id
    private Long id;

    private String username;
    private String name;
}
