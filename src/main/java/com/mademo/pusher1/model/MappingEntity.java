package com.mademo.pusher1.model;

import com.mademo.pusher1.EtudiantDto;
import jakarta.persistence.*;

@Entity
@NamedNativeQuery(
        name = "do_querry",
        query = ":querry",
        resultClass = Etudiant.class
)
@SqlResultSetMapping(
        name = "line_label_mapping",
        classes = @ConstructorResult(
                targetClass = EtudiantDto.class,
                columns = {
                        @ColumnResult(name = "numero", type = Integer.class),
                }
        )
)
public class MappingEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
}
