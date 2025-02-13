package com.unir.roleapp.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "role_class")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RoleClass {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name") private String name;

    @ManyToMany(
            mappedBy = "roleClasses",
            cascade = CascadeType.ALL,
            fetch = FetchType.EAGER
    )
    private List<Spell> spells;


//    @OneToOne(mappedBy = "roleClass")
//    private CharacterEntity characterEntity;
}
