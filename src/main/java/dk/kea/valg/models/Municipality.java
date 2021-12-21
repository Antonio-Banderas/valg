package dk.kea.valg.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Data
@Table(name = "municipalities")
@Entity
public class Municipality {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    /*
    @JsonIgnore
    @OneToMany(mappedBy = "municipality")
    private Set<Party> parties;
     */
}
